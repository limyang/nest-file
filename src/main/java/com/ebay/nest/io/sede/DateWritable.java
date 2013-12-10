package com.ebay.nest.io.sede;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableUtils;

import com.ebay.nest.io.sede.ByteStream.Output;
import com.ebay.nest.io.sede.lazybinary.LazyBinaryUtils;
import com.ebay.nest.io.sede.lazybinary.LazyBinaryUtils.VInt;

public class DateWritable implements WritableComparable<DateWritable> {
	private static final Log LOG = LogFactory.getLog(DateWritable.class);

	private static final long MILLIS_PER_DAY = TimeUnit.DAYS.toMillis(1);

	private static final ThreadLocal<TimeZone> LOCAL_TIMEZONE = new ThreadLocal<TimeZone>() {
		@Override
		protected TimeZone initialValue() {
			return Calendar.getInstance().getTimeZone();
		}
	};

	private int daysSinceEpoch = 0;

	public DateWritable() {
	}

	public DateWritable(DateWritable d) {
		set(d);
	}

	public DateWritable(Date d) {
		set(d);
	}

	public DateWritable(int d) {
		set(d);
	}

	public void set(int d) {
		daysSinceEpoch = d;
	}

	public void set(Date d) {
		if (d == null) {
			daysSinceEpoch = 0;
			return;
		}

		set(dateToDays(d));
	}

	public void set(DateWritable d) {
		set(d.daysSinceEpoch);
	}

	public Date get() {
		return new Date(daysToMillis(daysSinceEpoch));
	}

	public int getDays() {
		return daysSinceEpoch;
	}

	public long getTimeInSeconds() {
		return get().getTime() / 1000;
	}

	public static Date timeToDate(long l) {
		return new Date(l * 1000);
	}

	public static long daysToMillis(int d) {
		long millisUtc = d * MILLIS_PER_DAY;
		return millisUtc - LOCAL_TIMEZONE.get().getOffset(millisUtc);
	}

	public static int dateToDays(Date d) {
		long millisLocal = d.getTime();
		long millisUtc = millisLocal + LOCAL_TIMEZONE.get().getOffset(millisLocal);
		return (int) (millisUtc / MILLIS_PER_DAY);
	}

	public void setFromBytes(byte[] bytes, int offset, int length, VInt vInt) {
		LazyBinaryUtils.readVInt(bytes, offset, vInt);
		assert (length == vInt.length);
		set(vInt.value);
	}

	public void writeToByteStream(Output byteStream) {
		LazyBinaryUtils.writeVInt(byteStream, getDays());
	}

	public void readFields(DataInput in) throws IOException {
		daysSinceEpoch = WritableUtils.readVInt(in);
	}

	public void write(DataOutput out) throws IOException {
		WritableUtils.writeVInt(out, daysSinceEpoch);
	}

	public int compareTo(DateWritable d) {
		return daysSinceEpoch - d.daysSinceEpoch;
	}

	public boolean equals(Object o) {
		if (!(o instanceof DateWritable)) {
			return false;
		}
		return compareTo((DateWritable) o) == 0;
	}

	public String toString() {
		return get().toString();
	}

	public int hashCode() {
		return daysSinceEpoch;
	}
}
