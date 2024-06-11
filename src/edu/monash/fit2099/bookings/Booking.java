//Name:Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099.bookings;
import edu.monash.fit2099.vehicles.Vehicle;

/**
 * <h1>Booking</h1>
 * Booking class represents a specific booking for a vehicle
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class Booking {

    private Vehicle vehicle;

    /**
     * Constructor method
     * @param vehicle the vehicle to be booked in the Booking
     */
    public Booking(Vehicle vehicle) {
        this.vehicle = vehicle;

    }

    /**
     * This is a getter method that gets the price of the vehicle
     * @return a double value; represents the price of the vehicle
     */
    public double getVehiclePrice(){
        return this.vehicle.getPrice();
    }


    /**
     * A toString method that textually represents the vehicle
     * @return a String representing the vehicle
     */
    @Override
    public String toString() {

        return this.vehicle.toString();
    }

}