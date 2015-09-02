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
public class Rectangle {
    private int width;
    private int height;
    private Point origin;
    
    public Rectangle()  {
        origin = new Point(0,0);
    }
    
    public Rectangle(Point p) {
        origin = p;
    }
    
    public Rectangle(Point origin, int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int width, int height) {
        origin = new Point(0,0);
        this.width = width;
        this.height = height;
    }
    
    public void setOrigin(Point origin) {
        this.origin = origin;
    }
    
    public Point getOrigin() {
        return origin;
    }
    
    public void move(int moveX, int moveY) {
        origin = new Point(moveX, moveY);
    }
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getArea() {
        return width * height;
    }
}
