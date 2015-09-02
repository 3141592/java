/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagebasics;

/**
 *
 * @author rgunter
 */
public class LanguageBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        basicArray();
        multiArray();
        copyArray();
        copyArray2();
        prePost();
        bitDemo();
        switch1();
        doFor2();
        labeledBreak();
        labeledContinue();
        controlExercise(3);
        controlExerciseFixed1(3);
        controlExerciseFixed2(3);
    }
    
    public static void controlExerciseFixed2(int aNumber) {
        printMethod(Thread.currentThread().getStackTrace());
        if (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first string");
            }
            else {
                System.out.println("second string");
            }
        }
        System.out.println("third string");
    }
    
    public static void controlExerciseFixed1(int aNumber) {
        printMethod(Thread.currentThread().getStackTrace());
        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("first string");
            else 
                System.out.println("second string");
        
        System.out.println("third string");
    }
    
    public static void controlExercise(int aNumber) {
        printMethod(Thread.currentThread().getStackTrace());
        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("first string");
        else System.out.println("second string");
        System.out.println("third string");
    }
    
    public static void labeledContinue() {
        printMethod(Thread.currentThread().getStackTrace());
        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - 
                  substring.length();

        test:
            for (int i = 0; i <= max; i++) {
                int n = substring.length();
                int j = i;
                int k = 0;
                while (n-- != 0) {
                    if (searchMe.charAt(j++) != substring.charAt(k++)) {
                        continue test;
                    }
                }
                foundIt = true;
                break test;
            }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
    
    public static void labeledBreak() {
        printMethod(Thread.currentThread().getStackTrace());
        int[][] intArray ={
            {32,87,3,589},
            {12,1076,2000,8},
            {622,127,77,955}
        };
        
        int greaterThan = 1500;
        
        int i;
        int j = 0;
        boolean foundIt = false;
        
        search:
            for (i = 0; i < intArray.length; i++) {
                for ( j = 0; j < intArray[i].length; j++) {
                    if (intArray[i][j] > greaterThan) {
                        foundIt = true;
                        break search;
                    }
                }
            }
        
        if (foundIt) {
            System.out.println("Found: " + intArray[i][j] + " at: " + " i: " + i  + " j: " + j );
        }
    }

    public static void doFor2() {
        printMethod(Thread.currentThread().getStackTrace());
        int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
        
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
        
        String[] strings =
        {"one", "two","three","four"};
        
        for (String string : strings) {
            System.out.println(string);
        }
    }
    
    public static void doFor() {
        printMethod(Thread.currentThread().getStackTrace());
        
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
    
    public static void switch1() {
        printMethod(Thread.currentThread().getStackTrace());
        int month = 8;
        
        String monthString = "BLANK";
        switch (month) {
            case 1: monthString = "January";
                    break;
            case 8: monthString = "August";
                    break;
            case 12: monthString = "December";
                    break;
        }
        System.out.println(monthString);
    }
    
    public static void bitDemo() {
        printMethod(Thread.currentThread().getStackTrace());
        int bitmask = 0x000F;
        int val = 0x2222;
        
        System.out.println(val & bitmask);
        System.out.println(~val);
        System.out.println(val << 1);
        System.out.println(val >> 1);
        System.out.println(val >>> 1);
    }
        
    public static void prePost() {
        printMethod(Thread.currentThread().getStackTrace());
        int i = 3;
        ++i;
        System.out.println(i);
        int j = ++i;

        System.out.println(j);
    }
    
    public static void copyArray2() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom,2,25);
        System.out.println(new String(copyTo));
        System.out.println("copyFrom.length: " + copyFrom.length);
        System.out.println("copyTo.length: " + copyTo.length);
        java.util.Arrays.sort(copyFrom);
        System.out.println(java.util.Arrays.binarySearch(copyFrom, 'f'));
    }
    
    public static void copyArray() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char[] copyTo = new char[7];
        
        System.arraycopy(copyFrom, 2, copyTo, 0,7);
        System.out.println(new String(copyTo));
    }
    
    public static void multiArray() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        
        System.out.println(names[0][2] + names[1][1]);
        System.out.println("name.length: " + names.length);
    }
    
    public static void basicArray() {
        printMethod(Thread.currentThread().getStackTrace());
        // Declares an array of integers
        int[] anArray;
        // allocates memory for 10 integers
        anArray = new int[10];
        anArray[0] = 100;

        int[] anArray2 = {
            100, 200, 300,
            400, 500, 600,
            700, 800, 900,
            1000, 1100
        };
        
        System.out.println(anArray);
        System.out.println(anArray.toString());
        System.out.println(anArray[0]);
        System.out.println(anArray2[5]);
        
    }
    
    public static void printMethod(StackTraceElement[] stackArray) {
        System.out.println("=====" + stackArray[1].getMethodName() + "=====");
    }
}
