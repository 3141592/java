/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardsdemo;

/**
 *
 * @author rgunter
 */
public class CardsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.show();
        
        Card card2 = new Card("Hearts","K");
        card2.show();
        
        Deck deck = new Deck();
        deck.show();
    }
    
}
