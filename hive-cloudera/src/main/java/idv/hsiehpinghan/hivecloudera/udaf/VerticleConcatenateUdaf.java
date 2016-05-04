package idv.hsiehpinghan.hivecloudera.udaf;

import org.apache.hadoop.hive.ql.exec.UDAF;
import org.apache.hadoop.hive.ql.exec.UDAFEvaluator;
import org.apache.hadoop.io.Text;

@SuppressWarnings("deprecation")
public class VerticleConcatenateUdaf extends UDAF {
	public static class Evaluator implements UDAFEvaluator {
		private static final byte sep = '=';
		private Text result;

		@Override
		public void init() {
			result = null;
		}

		public boolean iterate(Text value) {
			if (value == null) {
				return false;
			}
			if (result == null) {
				result = new Text(value);
			} else {
				result = concat(result, value);
			}
			return true;
		}

		public Text terminatePartial() {
			return result;
		}

		public boolean merge(Text other) {
			return iterate(other);
		}

		public Text terminate() {
			return result;
		}

		private Text concat(Text result, Text value) {
			byte[] bArr_0 = result.getBytes();
			byte[] bArr_1 = value.getBytes();
			int len = bArr_0.length + 1 + bArr_1.length;
			byte[] bArr = new byte[len];
			int index = 0;
			for (int i = 0; i < bArr_0.length; ++i, ++index) {
				bArr[index] = bArr_0[i];
			}
			bArr[index] = sep;
			++index;
			for (int i = 0; i < bArr_1.length; ++i, ++index) {
				bArr[index] = bArr_1[i];
			}
			return new Text(bArr);
		}
	}
}
