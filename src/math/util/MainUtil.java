/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import luan.util.MathUtility;

/**
 *
 * @author PC
 */
public class MainUtil {
    public static void main(String[] args) {
        
        long expected=120; // t nhan 120 neu goi ham 5!
        long actual=MathUtility.getPactorial(5);
        System.out.println("S1: Expected: "+expected+";Actual: "+actual);
        
        //expected: 720 if tinh 6!
        System.out.println("S1: "+MathUtility.getPactorial(6));
        
        //expected: 1 if tinh 0!
        System.out.println("S1: "+MathUtility.getPactorial(1));
        
        //expected: IllegalArugmentException if tinh -5
        System.out.println("S1: "+MathUtility.getPactorial(-5));
    }
}
