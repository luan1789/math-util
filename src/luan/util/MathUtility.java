/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luan.util;

/**
 *
 * @author PC
 */
public class MathUtility {

    // class fake class Math
    // Math jdk co.abs(), sqrt(),sin(),PI
    // chung toan la static, thu vien dung chung
    public static double PI = 3.1415;

//    public static long getPactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("N must be between 0..20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i; 
//        }
//        return result;
//    }
    
    //viet de quy cho hoanh trang
    //n!=n*(n-1)!
    public static long getPactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("N must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //n>1 & n<=20
        return n*getPactorial(n-1);
    }
    //minh hoa khai niem refactoring -toi uu chinh sua lai code cho tot hon
    //minh hoa khai niem regression test-test lai nhung j da test de check coi
    //code con sach khong sau khi sua code
    
}
