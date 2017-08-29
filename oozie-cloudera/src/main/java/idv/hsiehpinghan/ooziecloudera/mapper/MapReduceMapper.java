package idv.hsiehpinghan.ooziecloudera.mapper;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class MapReduceMapper implements Mapper<LongWritable, Text, LongWritable, Text> {

	@Override
	public void configure(JobConf arg0) {
		// do nothing
	}

	@Override
	public void map(LongWritable key, Text value, OutputCollector<LongWritable, Text> collector, Reporter reporter)
			throws IOException {
		collector.collect(key, value);
	}

	@Override
	public void close() throws IOException {
		// do nothing
	}

}
