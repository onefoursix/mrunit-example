MRUnit Example
==============================

This project shows how to build and test a MapReduce jar file using MRUnit and Maven

For full information on MRUnit see http://mrunit.apache.org/

Other good links are:

* Tutorial:	https://cwiki.apache.org/confluence/display/MRUNIT/MRUnit+Tutorial

* Javadoc:	http://mrunit.apache.org/documentation/javadocs/0.9.0-incubating/overview-summary.html

* Getting Started with MRUnit: http://mrunit.apache.org/documentation/javadocs/0.9.0-incubating/org/apache/hadoop/mrunit/package-summary.html


Install Maven
-------------
If maven is not already installed:

* Download maven from http://maven.apache.org/download.html

* Unzip the maven download and place it somewhere.  Mine is at /Users/mbrooks/apache/apache-maven-3.0.4

* Set an environment variable M2_HOME to point to the maven home directory

* Add $M2_HOME/bin to your path

Test maven is installed by running the mvn command from a dir without a pom.xml file and you should get a message like this:

	$ mvn
	[INFO] Scanning for projects...
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD FAILURE
	[INFO] ------------------------------------------------------------------------
	...
	


Compile the example and run the MRUnit tests
--------------------------------------------

To compile the example and run the MRUnit tests, switch to this project's root dir and execute the command: 

	> mvn clean test

You should see output like this:

	$ mvn clean test
	[INFO] Scanning for projects...
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building mrunit-example 1.0
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-clean-plugin:2.4.1:clean (default-clean) @ mrunit-example ---
	[INFO] Deleting /Users/mbrooks/mrunit-example/target
	[INFO] 
	[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ mrunit-example ---
	[debug] execute contextualize
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/mbrooks/mrunit-example/src/main/resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ mrunit-example ---
	[INFO] Compiling 3 source files to /Users/mbrooks/mrunit-example/target/classes
	[INFO] 
	[INFO] --- maven-resources-plugin:2.5:testResources (default-testResources) @ mrunit-example ---
	[debug] execute contextualize
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /Users/mbrooks/mrunit-example/src/test/resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:2.3.2:testCompile (default-testCompile) @ mrunit-example ---
	[INFO] Compiling 4 source files to /Users/mbrooks/mrunit-example/target/test-classes
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ mrunit-example ---
	[INFO] Surefire report directory: /Users/mbrooks/mrunit-example/target/surefire-reports

	-------------------------------------------------------
 	T E S T S
	-------------------------------------------------------
	Running com.onefoursix.wordcount.WordCountMapperTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.399 sec
	Running com.onefoursix.wordcount.WordCountReducerTest
	Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.107 sec
	Running com.onefoursix.wordcount.WordCountTest
	Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.057 sec

	Results :

	Tests run: 7, Failures: 0, Errors: 0, Skipped: 0

	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD SUCCESS
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time: 2.626s
	[INFO] Finished at: Mon Sep 24 08:41:58 PDT 2012
	[INFO] Final Memory: 12M/81M
	[INFO] ------------------------------------------------------------------------

Note that all seven tests passed and the build succeeded.

The package phase created the jar ./sssss



