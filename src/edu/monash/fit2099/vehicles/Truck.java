//Name:Steven Kaing
//ID: 33155666
//Last Modified: 26/03/2024

package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.utils.Utility;


/**
 * <h1>Truck<h1>
 * The class representing the truck vehicle
 * @author Steven Kaing
 * @version 1.0.0
 * @since 10/04/2024
 */
public class Truck extends Vehicle {
    /**
     * This class provides blueprint of this type of vehicle: edu.monash.fit2099.vehicles.Truck
     */

    //Private Attributes:
    private double loading;
    private int id = Utility.generateRandomInt(100, 999);


    /**
     * Constructor method
     * @param brand the brand of the vehicle
     * @param year the year model of the vehicle
     * @param price the cost of the vehicle
     * @param loading the loading of the truck
     */
    public Truck(String brand, int year, double price, double loading){

        //Create superclass
        super(brand,year,price);
        this.loading = loading;
    }

    /**
     * A toString method that textually represents the vehicle
     * @return a String representing the vehicle
     */
    @Override
    public String toString(){
        //Return String Representation of Truck:
        return String.format(" ID: Truck%d | %sLoading: %.1f",id,super.toString(),loading);

    }


}
