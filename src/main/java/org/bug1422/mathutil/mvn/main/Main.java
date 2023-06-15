/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.bug1422.mathutil.mvn.main;

import org.bug1422.mathutil.mvn.MathUtility;

/**
 *
 * @author binla
 */
public class Main {

        public static void main(String[] args) {
            //Test case #1: n = 0
            System.out.println("Check getF(0) 0! | expected: 1 | actual: " + MathUtility.getFactorial(0));

            //Test case #2: n = 1
            System.out.println("Check getF(1) 1! | expected: 1 | actual: " + MathUtility.getFactorial(1));

            //Test case #3: n = 2
            System.out.println("Check getF(2) 2! | expected: 2 | actual: " + MathUtility.getFactorial(2));

            //Test case #4: n = 3
            System.out.println("Check getF(3) 3! | expected: 6 | actual: " + MathUtility.getFactorial(3));

            //Test case #5: n = 5
            System.out.println("Check getF(5) 5! | expected: 120 | actual: " + MathUtility.getFactorial(5));

            //am giai thua thi sao???
            //Test case #6: n = -1
            System.out.println("Check getF(-1) -1! | expected: Exception | actual: ");
            MathUtility.getFactorial(-1); //vi ngoai le se ngat ngang cau lenh println()
            //in truoc roi cho ngoai le xh
        }
        //THIET KE HAM GIAI THUA: AM GIAI THUA < 1 VA > 21 
        //HAM SE NEM RA NGOAI LE

        //test case 1: check if getFactorial(0) returns well with n=0;
        //Steps/Procedures
        // - input n = 0 to the function/method
        // - run the method to get the actual value of 0!
        //Expected: 0! must be is 1, expected value = 1
        //chuan bi bo data va expected value
        //sau do run cac test case de coi dung sai!!!
        //test case 2: check if getFactorial(1) returns well with n=1;
        //Steps/Procedures
        // - input n = 0 to the function/method
        // - run the method to get the actual value of 0!
        //Expected: 0! must be is 1, expected value = 1
        //chuan bi bo data va expected value
        //sau do run cac test case de coi dung sai!!!
        //TDD: Test Driven Development: viet code, lam app theo style
        //code va test song hanh voi nhau
        //code va test code la cap bai trung, code lien tuc dc test
        //du moi viet so so
        //phai nghi ngay luon cac bo test case khi bat dau viet code
        //DAC TRUNG CUA TDD: XANH XANH DO DO
}
