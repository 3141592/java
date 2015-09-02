/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesandobjects;

/**
 *
 * @author rgunter
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        varArgs(1,2,3,4,5,6);
    }
    
    public static void varArgs(int ... arguments) {
        System.out.println(arguments.length);
        System.out.println(arguments.getClass().getName());
    }
    
}
