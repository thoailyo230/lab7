/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excerice3;

/**
 *
 * @author Admin
 */
public class Rectange implements Shape{
    private float width;
    private float height;
    @Override 
    public double getArea(){
        return width*height;
    }
    @Override
    public void  getParameter(){
        System.out.println("parameter rectange are width and height");
    }

    public Rectange(float width, float height) {
        this.width = width;
        this.height = height;
    }
    public void isSquare(){
        System.out.println("Excerice3.Rectange.isSquare()");
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectange{" + "width=" + width + ", height=" + height + '}';
    }
    
}
