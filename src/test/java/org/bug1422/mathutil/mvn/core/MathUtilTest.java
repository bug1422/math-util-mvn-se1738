/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bug1422.mathutil.mvn.core;

import org.bug1422.mathutil.mvn.core.*;
import static org.bug1422.mathutil.mvn.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author binla
 */
public class MathUtilTest {

    @Test // {expected=tên-ngoại-lệ.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //assertThrows(expectedType, executable);
        //         ngoại lệ cần bắt | đoạn code gây ra ngoại lệ
        //                            phải đưa 1 object chứa đoạn code gây ra E      
        //                            lambda expression đưa vào
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                getFactorial(-5);
            }
        };
        Executable exLambda = () -> getFactorial(-5);
        assertThrows(IllegalArgumentException.class, exLambda);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //assertEquals(70,70);
        assertEquals(1, getFactorial(1)); //hy vong 1! tra ve 1
        assertEquals(2, getFactorial(2)); //hy vong 2! tra ve 2
        assertEquals(6, getFactorial(3)); //hy vong 3! tra ve 6
        assertEquals(24, getFactorial(4)); //hy vong 4! tra ve 24
        assertEquals(120, getFactorial(5)); //hy vong 5! tra ve 120
    }
//    @Test
//    public void testFactorialGivenRightArgument0ReturnsWell(){
//        long expected = 1;  //hy vong 0! tra ve 1
//        long actual;        //actual = may, cho ham chay moi biet
//        actual = MathUtility.getFactorial(0);
//        assertEquals(expected, actual);
//    }
}
