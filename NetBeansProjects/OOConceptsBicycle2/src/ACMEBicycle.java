/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rgunter
 */
public class ACMEBicycle implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 0;
    
    public void changeCadence(int newValue) {
        cadence = newValue;
    }
    
    public void speedUp(int increment) {
        speed = speed + increment;
    }
    
    public void changeGear(int newValue) {
        gear = newValue;
    }
    
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    
    void printStates() {
        System.out.println("gears: " + NUM_GEARS + " cadence:" + cadence +
                " speed: " + speed +
                " gear: " + gear);
    }
    
    void printClass() {
        System.out.println(this.getClass());
    }
}
