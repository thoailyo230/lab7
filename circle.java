/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excerice3;

/**
 *
 * @author Admin
 */
public class Circle implements Shape{
    final float PI = 3.14f;
    private float radius;
    @Override
        public double getArea(){
            return radius*radius*PI;
        }
        @Override
        public void getParameter(){
            System.out.println("Excerice3.Circle.getParameter()");
        }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

}
