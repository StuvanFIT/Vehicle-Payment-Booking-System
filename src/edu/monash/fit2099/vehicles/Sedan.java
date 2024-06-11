//Name:Steven Kaing
//ID: 33155666
//Last Modified: 26/03/2024

package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.utils.Utility;

/**
 * <h1>Sedan<h1>
 * The class representing the sedan vehicle
 * @author Steven Kaing
 * @version 1.0.0
 * @since 10/04/2024
 */
public class Sedan extends Vehicle {

    /**
     * This class provides blueprint of this type of vehicle: edu.monash.fit2099.vehicles.Sedan
     */

    //Private Attributes:
    private double range;
    private String engineType;
    private int id = Utility.generateRandomInt(10000, 99999);


    /**
     * Constructor method
     * @param brand the brand of the vehicle
     * @param year the year model of the vehicle
     * @param price the cost of the vehicle
     * @param engineType the type of engine used by Sedan
     */
    public Sedan(String brand, int year, double price, double range, String engineType){

        super(brand,year,price);
        this.range = range;
        this.engineType = engineType;

    }


    /**
     * A toString method that textually represents the vehicle
     * @return a String representing the vehicle
     */
    @Override
    public String toString(){

        //Return String Representation Sedan:
        return String.format(" ID: Sedan%d | %s Range: %.2f Kilometres | Engine Type: %s",id,super.toString(),range,engineType);

    }


}