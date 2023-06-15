/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.nghiant.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import static org.nghiant.mathutil.core.MathUtility.*;

/**
 *
 * @author nghia
 */
public class MathUtilityTest {

    //test ngoại lệ thì sao?
    @Test //(exceptedType=tên-ngoại-lệ.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
//        assertThrows(expectedType, executable);
        //           ngoại lệ cần bắt   đưa đoạn code gây ra ngoại lệ   đoạn code gây ra ngoại lệ
        //                              đưa 1 object chứa đoạn code gây Exception
        //                              lambda expression đưa vào

//        Executable ex = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
//
//        Executable exLamda = () -> getFactorial(-5);

        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }

    @Test
    public void testFactorialGivenRightArguementReturnsWell() {
        //assertEquals(69, 70);

        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
    }

}
