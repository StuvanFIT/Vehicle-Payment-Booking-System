//Name:Steven Kaing
//ID: 33155666
//Last Modified: 26/03/2024

package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.utils.Utility;


/**
 * <h1>SUV<h1>
 * The class representing the tSUV vehicle
 * @author Steven Kaing
 * @version 1.0.0
 * @since 10/04/2024
 */
public class SUV extends Vehicle {

    /**
     * This class provides blueprint of this type of vehicle: edu.monash.fit2099.vehicles.SUV
     */


    //Private Attributes
    private int seating;
    private String engineType;
    private int id = Utility.generateRandomInt(1000, 9999);



    /**
     * Constructor method
     * @param brand the brand of the vehicle
     * @param year the year model of the vehicle
     * @param price the cost of the vehicle
     * @param engineType the type of engine used by SUV
     */
    public SUV (String brand, int year, double price, int seating, String engineType){

        super(brand,year,price);
        this.seating = seating;
        this.engineType = engineType;
    }

    /**
     * A toString method that textually represents the vehicle
     * @return a String representing the vehicle
     */
    @Override
    public String toString(){

        //Return String Representation of edu.monash.fit2099.vehicles.SUV:
        return String.format(" ID: SUV%d | %sSeating: %d seats | Engine Type: %s",id,super.toString(),seating,engineType);
    }


}