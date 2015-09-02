/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardsdemo;

import java.util.Arrays;

/**
 *
 * @author rgunter
 */
public class Card {
    private String suit;
    private String rank;
    
    public static final String[] SUITS =
        {"Hearts", "Diamonds", "Clubs", "Spades"};
    
    public static final String[] RANKS =
        {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    
    public Card() {
        setSuit("Spades");
        setRank("A");
    }
    
    public Card(String suit, String rank) {
        setSuit(suit);
        setRank(rank);
    }
    
    public void setSuit(String suit) {
        if (Arrays.asList(SUITS).contains(suit)) {
            this.suit = suit;
        } else {
            System.out.println("Invalid suit: " + suit);
        }
    }
    
    public void setRank(String rank) {
        if (Arrays.asList(RANKS).contains(rank)) {
            this.rank = rank;
        } else {
            System.out.println("Invalid rank: " + rank);
        }
    }
    
    public String getSuit() {
        return suit;
    }
    
    public String getRank() {
        return rank;
    }
    
    public void show() {
        System.out.println(rank + " of " + suit);
    }
}
