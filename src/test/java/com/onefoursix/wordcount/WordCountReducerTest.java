package com.onefoursix.wordcount;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.junit.Test;

public class WordCountReducerTest extends WordCountTestBase {
	
	@Test
	public void testReducerWithCats() {
		List<IntWritable> values = new ArrayList<IntWritable>();
		values.add(new IntWritable(1));
		values.add(new IntWritable(1));
		reduceDriver.withInput(new Text("cat"), values);
		reduceDriver.withOutput(new Text("cat"), new IntWritable(2));
		reduceDriver.runTest();
	}
	
	@Test
	public void testReducerWithDogs() {
		List<IntWritable> values = new ArrayList<IntWritable>();
		values.add(new IntWritable(1));
		values.add(new IntWritable(1));
		reduceDriver.withInput(new Text("dog"), values);
		reduceDriver.withOutput(new Text("dog"), new IntWritable(2));
		reduceDriver.runTest();
	}
	
	@Test
	public void testReducerWithHorses() {
		List<IntWritable> values = new ArrayList<IntWritable>();
		values.add(new IntWritable(1));
		values.add(new IntWritable(1));
		reduceDriver.withInput(new Text("horse"), values);
		reduceDriver.withOutput(new Text("horse"), new IntWritable(2));
		reduceDriver.runTest();
	}
	
	/* if uncommented, this test will fail */
	/*
	@Test
	public void testReducerWithZebras() {
		List<IntWritable> values = new ArrayList<IntWritable>();
		values.add(new IntWritable(1));
		values.add(new IntWritable(1));
		reduceDriver.withInput(new Text("horse"), values);
		reduceDriver.withOutput(new Text("zebra"), new IntWritable(2));
		reduceDriver.runTest();
	}
	*/
	

}
