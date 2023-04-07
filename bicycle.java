/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.Excercire1;

/**
 *
 * @author Admin
 */
public  class bicycle extends Vehical {
    @Override
    public double getSpeed(){
        return 25;
    }

    public bicycle(String typeofVehical, Brand brand) {
        super("Bicycle", brand);
    }

    
    
}
