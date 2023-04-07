/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.Excercire1;

/**
 *
 * @author Admin
 */
public class Brand {
    public String Manufacturers_Name;
    public String Country_Name;

    public Brand(String Manufacturers_Name, String Country_Name) {
        this.Manufacturers_Name = Manufacturers_Name;
        this.Country_Name = Country_Name;
    }

    public String getManufacturers_Name() {
        return Manufacturers_Name;
    }

    public void setManufacturers_Name(String Manufacturers_Name) {
        this.Manufacturers_Name = Manufacturers_Name;
    }

    public String getCountry_Name() {
        return Country_Name;
    }

    public void setCountry_Name(String Country_Name) {
        this.Country_Name = Country_Name;
    }

    public Brand() {
    }

    @Override
    public String toString() {
        return "Brand{" + "Manufacturers_Name=" + Manufacturers_Name + ", Country_Name=" + Country_Name + '}';
    }
    
}
