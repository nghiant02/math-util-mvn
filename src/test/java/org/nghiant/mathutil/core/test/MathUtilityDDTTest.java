/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.nghiant.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.nghiant.mathutil.core.MathUtility;

/**
 *
 * @author nghia
 */
public class MathUtilityDDTTest {
    
    public static Object[][] initTestData(){
        Integer testData[][] = {{0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {5,120}};
                                // n expected
                                //c0, c1
   
        return testData;
    }
  
    //NHỒI DATA Ở TRÊN VÀO TRONG HÀM assertEquals(exepect-cột 1, getF(cột 0));
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
    
}

// KỸ THUẬT DDT - DATA DRIVEN TESTING - TÁCH DATA KIỂM THỬ RA KHỎI CÂU LỆNH
// ASERT() CHO DỄ THEO DÕI, DỄ BẢO TRÌ CÁC BỘ TEST CASE, CÁC BỘ TEST DATA

//THƯỜNG DÙNG MẢNG 2 CHIỀU ĐỂ CHỨA BỘ DATA TEST 
// MẢNG 2 CHIỀU GỒM: CÁC INPUT, VÀ EXPECTED
// CÁC UNIT TEST FRAMEWORK TỰ ĐỘNG BIẾT CÁCH TRÍCH TỪNG CẶP
//INPUT/EXPECTED Ở TRONG MẢNG RA RỒI NHỒI VÀO TRONG HÀM SO SÁNH

// MẢNG DỮ LIỆU TEST CASE PHẢI LÀ PUBLIC STATIC - QUY ƯỚC
