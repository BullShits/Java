package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.*;
import static org.junit.Assert.*;

/**
 * Created by admin on 西暦15/11/09.
 */

@RunWith(Parameterized.class)
public class ParameterizedTestFields {
    @Parameter
    public int m1;
    @Parameter (value = 1)
    public int m2;

    @Parameters
    public static Collection<Object []> data(){
        Object[][] data = new Object[][]{{1,2}, {4,5}, {7,8}};
        return Arrays.asList(data);
    }

    @Test
    public void testMultiplyException(){
        MyUnit m = new MyUnit();
        assertEquals("message", m1 * m2, m.multiply(m1,m2));
    }


}
