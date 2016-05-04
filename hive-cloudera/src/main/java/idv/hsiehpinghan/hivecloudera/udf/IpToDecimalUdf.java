package idv.hsiehpinghan.hivecloudera.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

public class IpToDecimalUdf extends UDF {
	public LongWritable evaluate(final Text ip) {
		String[] arr = ip.toString().split("\\.");
		int i_0 = Integer.valueOf(arr[0]);
		int i_1 = Integer.valueOf(arr[1]);
		int i_2 = Integer.valueOf(arr[2]);
		int i_3 = Integer.valueOf(arr[3]);
		return new LongWritable((i_0 * 256L * 256L * 256L)
				+ (i_1 * 256L * 256L) + (i_2 * 256L) + i_3);
	}
}
