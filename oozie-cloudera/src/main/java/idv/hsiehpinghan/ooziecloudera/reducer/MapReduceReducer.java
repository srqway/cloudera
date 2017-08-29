package idv.hsiehpinghan.ooziecloudera.reducer;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class MapReduceReducer implements Reducer<LongWritable, Text, LongWritable, Text> {

	@Override
	public void configure(JobConf arg0) {
		// do nothing
	}

	@Override
	public void reduce(LongWritable key, Iterator<Text> values, OutputCollector<LongWritable, Text> collector,
			Reporter reporter) throws IOException {
		while (values.hasNext()) {
			collector.collect(key, values.next());
		}
	}

	@Override
	public void close() throws IOException {
		// do nothing
	}

}
