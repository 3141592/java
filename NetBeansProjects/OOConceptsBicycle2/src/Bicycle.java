/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dchilds
 */
interface Bicycle {
    static final int NUM_GEARS = 6;
    
    void changeCadence(int newValue);
    
    void speedUp(int increment);
    
    void changeGear(int newValue);
    
    void applyBrakes(int decrement);
}
