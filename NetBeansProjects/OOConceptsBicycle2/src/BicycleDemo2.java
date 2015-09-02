/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dchilds
 */
public class BicycleDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Create two different 
        // Bicycle objects
        ACMEBicycle bike1 = new ACMEBicycle();
        KMARTBicycle bike2 = new KMARTBicycle();

        // Invoke methods on 
        // those objects
        bike1.printClass();
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.printClass();
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        
    }
    
}
