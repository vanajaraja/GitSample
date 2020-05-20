package org.tcs.test;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/*@RunWith (Suite.class)
@Suite.SuiteClasses({TitanLogInTC.class,TitanNewArrivalTC.class})*/

public class TestSuiteClass {
	
@Test
public void results() {
	
	Result runClasses = JUnitCore.runClasses(TitanLogInTC.class,TitanNewArrivalTC.class);
	System.out.println("Number of test cases ran" + runClasses.getRunCount());
	System.out.println("Number of test cases failed" + runClasses.getFailureCount());
	System.out.println("Number of test cases ignored" + runClasses.getIgnoreCount());
	System.out.println("Run time of the test suite" + runClasses.getRunTime());
}
}
               