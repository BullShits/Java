package com.company;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Result result = JUnitCore.runClasses(MyUnitTest.class);
        for(Failure fail: result.getFailures()){
            System.out.println(fail.toString());
        }
    }
}
