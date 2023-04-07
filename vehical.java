es (43 sloc)  1.24 KB
 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.Excercire1;

/**
 *
 * @author Admin
 */
public abstract class Vehical {
    protected  String typeofVehical;
  Brand brand ;

    public Vehical() {
        super();
    }

    public Vehical(String typeofVehical, Brand brand) {
        super();
        this.typeofVehical = typeofVehical;
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

   

    public String getTypeofVehical() {
        return typeofVehical;
    }

    public void setTypeofVehical(String typeofVehical) {
        this.typeofVehical = typeofVehical;
    }
    
    public void Begin(){
        System.out.println("Begin");
    }
    public void Acceleration(){
        System.out.println("Acceleration one more time !");
    }
    public abstract double getSpeed();
    
     public String getManufacturers_Name() {
         return this.brand.getManufacturers_Name();//lấy tên hãng sản xuất
     }
}
