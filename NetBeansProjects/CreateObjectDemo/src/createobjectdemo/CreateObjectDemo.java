/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createobjectdemo;

/**
 *
 * @author rgunter
 */
public class CreateObjectDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create point object and 2 rectangles
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
        
        // Display rectOnes fields
        System.out.println("rectOne Width: " + rectOne.getWidth());
        System.out.println("rectOne Height: " + rectOne.getHeight());
        System.out.println("rectOne Area: " + rectOne.getArea());

        // set rectTwos positiion
        rectTwo.setOrigin(originOne);
        
        // display rectTwos position
        System.out.println("rectTwo X Pos: " + rectTwo.getOrigin().getX());
        System.out.println("rectTwo Y Pos: " + rectTwo.getOrigin().getY());
        
        //move rectTwo
        rectTwo.move(40, 72);
        System.out.println("rectTwo X Pos: " + rectTwo.getOrigin().getX());
        System.out.println("rectTwo Y Pos: " + rectTwo.getOrigin().getY());
        
        // create a Line
        Line line = new Line();
        System.out.println("Line length: " + line.getLength());
    }
    
}
