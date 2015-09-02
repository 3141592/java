/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

/**
 *
 * @author dchilds
 */
public class JavaBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runDataTypes();
        runArrays();
    }
    
    static void runArrays() {
        
    }
    
    static void runDataTypes() {
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;
        
        System.out.println("byte: " + b);
        
        // The number 26, in decimal
        int decVal = 26;
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        // The number 26, in binary
        int binVal = 0b11010;
        System.out.println("decVal: " + decVal);
        System.out.println("hexVal: " + hexVal);
        System.out.println("binVal: " + binVal);
        
        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1  = 123.4f;
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("f1: " + f1);
        
        char span1 = '\u0108';
        System.out.println("span1: " + span1);
        
        String span2 = "S\u00ED Se\u00F1or";
        System.out.println("span1: " + span2);
    }
}
