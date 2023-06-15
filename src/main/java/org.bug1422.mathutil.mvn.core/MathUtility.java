/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bug1422.mathutil.mvn;


public class MathUtility {
    public static final double PI = 3.14;
    
    //ham tinh n! = 1.2.3..n
    //0! = 1! = 1
    //21! la kieu long ko chua noi
    //gai rang buoc dau vao cho ham/method
    public static long getFactorial(int n){
        if(n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be between 0..20, pls.");
        else if(n == 0) return 1;
        else return n * getFactorial(n-1);
    }
    //return som de ham ko bao loi
}
