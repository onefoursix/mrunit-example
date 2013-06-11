package com.onefoursix.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.junit.Test;

public class WordCountMapperTest extends WordCountTestBase {
	
	@Test
	public void testMapperWithCatsAndDogs() {
		mapDriver.withInput(new LongWritable(1), new Text("cat cat dog"));
		mapDriver.withOutput(new Text("cat"), new IntWritable(1));
		mapDriver.withOutput(new Text("cat"), new IntWritable(1));
		mapDriver.withOutput(new Text("dog"), new IntWritable(1));
		mapDriver.runTest();
	}
	
	@Test
	public void testMapperWithHorsesAndZebras() {
		mapDriver.withInput(new LongWritable(1), new Text("horse horse zebra"));
		mapDriver.withOutput(new Text("horse"), new IntWritable(1));
		mapDriver.withOutput(new Text("horse"), new IntWritable(1));
		mapDriver.withOutput(new Text("zebra"), new IntWritable(1));
		mapDriver.runTest();
	}
	
	/* if uncommented, this test will fail */
	/*
	@Test
	public void testMapperWithZebrasAndHorses() {
		mapDriver.withInput(new LongWritable(1), new Text("horse zebra horse"));
		mapDriver.withOutput(new Text("horse"), new IntWritable(1));
		mapDriver.withOutput(new Text("horse"), new IntWritable(1));
		mapDriver.withOutput(new Text("zebra"), new IntWritable(1));
		mapDriver.runTest();
	}
	*/
	


}
