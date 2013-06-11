package com.onefoursix.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.junit.Test;

public class WordCountMapReduceTest extends WordCountTestBase {
	
	  @Test
	  public void testMapReduceWithCatsAndDogs() {
	    mapReduceDriver.withInput(new LongWritable(1), new Text("cat cat dog"));
	    mapReduceDriver.addOutput(new Text("cat"), new IntWritable(2));
	    mapReduceDriver.addOutput(new Text("dog"), new IntWritable(1));
	    mapReduceDriver.runTest();
	  }
	  
	  @Test
	  public void testMapReduceWithHorsesAndZebras() {
	    mapReduceDriver.withInput(new LongWritable(1), new Text("horse zebra horse"));
	    mapReduceDriver.addOutput(new Text("horse"), new IntWritable(2));
	    mapReduceDriver.addOutput(new Text("zebra"), new IntWritable(1));
	    mapReduceDriver.runTest();
	  }
	  
	  
	  /* if uncommented, this test will fail */
	  /*
	  @Test
	  public void testMapReduceWithLizardsAndGiats() {
	    mapReduceDriver.withInput(new LongWritable(1), new Text("lizard lizard goat"));
	    mapReduceDriver.addOutput(new Text("lizard"), new IntWritable(2));
	    mapReduceDriver.addOutput(new Text("hyena"), new IntWritable(1));
	    mapReduceDriver.runTest();
	  }
	  */
	  
	  

}
