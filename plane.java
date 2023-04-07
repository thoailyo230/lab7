/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.Excercire1;

/**
 *
 * @author Admin
 */
public class Plane extends Vehical{
    private String Fuel;

    public Plane(String Fuel, String typeofVehical, Brand brand) {
        super("MH570", brand);
        this.Fuel = Fuel;
    }

    

   

    public String getFuel() {
        return Fuel;
    }

    public void setFuel(String Fuel) {
        this.Fuel = Fuel;
    }
     
    public void catCanh(){
        System.out.println("catCanh fly through air");
    }
    public void haCanh(){
        System.out.println("haCAnh in HCM city"); 
    }
    
    @Override
    public double getSpeed(){
        return 300;
    }

    
}
