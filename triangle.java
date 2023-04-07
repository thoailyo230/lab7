/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excerice3;

/**
 *
 * @author Admin
 */
public class Triangle implements Shape{
   private float sides;
   private String paremeter;
   
   @Override 
   public double getArea(){
       return sides*sides;
   }
   @Override
       public void getParameter(){
           System.out.println("Excerice3.Triangle.getParameter()");
       }

    public Triangle(float sides, String paremeter) {
        this.sides = sides;
        this.paremeter = paremeter;
    }

    public float getSides() {
        return sides;
    }

    public void setSides(float sides) {
        this.sides = sides;
    }

    public String getParemeter() {
        return paremeter;
    }

    public void setParemeter(String paremeter) {
        this.paremeter = paremeter;
    }
       
       
}
