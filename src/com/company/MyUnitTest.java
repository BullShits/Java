package com.company;


import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Created by admin on 西暦15/11/09.
 */
public class MyUnitTest {
    @Test
    public void testConcatenate(){
        MyUnit myUnit = new MyUnit();
        String s = myUnit.concatenate("one1","two2");
        assertEquals("one1two2", s);
    }

//    @Test (timeout = 100)
//    public void testTimeOut(){
//        for (int i = 0; i < 10000000; i++){
////            System.out.println(" " + i);
//        }
//    }
    @Test (expected = ArithmeticException.class)
    public void testExceptionIsThrown(){
        MyUnit myUnit = new MyUnit();
        myUnit.multiply(5,0);
    }
//    @Test
//    public void testMultiply(){
//        MyUnit myUnit = new MyUnit();
//        int a = myUnit.multiply(5,0);
//        assertEquals("5 / 0 is ", 0, a);
//    }
}
