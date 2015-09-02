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
public class Deck {
    private java.util.List<Card> cards = new java.util.ArrayList<Card>();
    
    public Deck() {
        for (String suit : Card.SUITS) {
            for (String rank : Card.RANKS) {
                Card card = new Card(suit,rank);
                cards.add(card);
            }
        }
    }
    
    public void show() {
        for (Card card : cards) {
            card.show();
        }
    }
}
