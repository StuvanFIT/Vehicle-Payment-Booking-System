//Name:Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024


//Import Modules and declares package
package edu.monash.fit2099.bookings;
import edu.monash.fit2099.interfaces.Action;
import edu.monash.fit2099.interfaces.ActionCapable;
import edu.monash.fit2099.menu.Menu;
import edu.monash.fit2099.payment.*;
import edu.monash.fit2099.vehicles.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Booking System</h1>
 *Booking Systems the main entity that is responsible for managing booked vehicles, creating vehicles, adding user into the system
 * and is the driver for displaying the console menu options to the end user.
 * @author Steven Kaing
 * @version 1.0.0
 * @since 2024-04-04
 */
public class BookingSystem {

    //Private Attributes
    private List<Vehicle> vehicleArray = new ArrayList<Vehicle>(); //Create vehicle list
    private User user = new User(0); //Create User into system


    /**
     * Printing initial menu screen to welcome end user. Calls methods to create objects to be added into the system
     */
    public void printStatus() {

        //Display opening message
        System.out.println("==================================");
        System.out.println("Welcome to FIT2099 Booking System!");
        System.out.println("==================================");

        //Call the createVehicles() method:
        this.createVehicles();

        //Create Payment methods: System should also be responsible for creating payment pathways. User cannot be responsible for creating payment methods
        this.createPayment();

        //Display Vehicle's string representation:
        this.consoleMenu();

        //Display ending message
        System.out.println("\n======================================");
        System.out.println("Thank you for visiting FIT2099 System!");
        System.out.println("======================================");
    }

    /**
     * Instantiate new payment service objects to be added into system
     */
    public void createPayment(){
        user.addPayment(new ApplePay());
        user.addPayment(new GooglePay());
    }


    /**
     * Instantiate new vehicle objects to be added into system
     */
    public void createVehicles() {

        //Create Vehicle Objects: You can ‘hard-code’ the attributes’ values when creating these objects

        //2 sedan instances:
        Vehicle sedan1 = new Sedan("Lexus", 2023, 200, 500, "ELECTRIC");
        Vehicle sedan2 = new Sedan("BMW", 2022, 150, 600, "PETROL");

        //Add 2 new instances to the array of vehicles:
        vehicleArray.add(sedan1);
        vehicleArray.add(sedan2);

        //2 edu.monash.fit2099.vehicles.SUV instances:
        Vehicle suv1 = new SUV("Tesla", 2023, 300, 5, "ELECTRIC");
        Vehicle suv2 = new SUV("Mercedes", 2020, 500, 7, "DIESEL");

        //Add 2 new instances to the array of vehicles:
        vehicleArray.add(suv1);
        vehicleArray.add(suv2);


        //2 truck instances:
        Vehicle truck1 = new Truck("Ford", 2019, 400, 1.0);
        Vehicle truck2 = new Truck("Volkswagen", 2020, 450, 1.2);

        //Add 2 new instances to the array of vehicles:
        vehicleArray.add(truck1);
        vehicleArray.add(truck2);
    }

    /**
     * Display vehicles to the display terminal
     */
    public void displayVehicles() {
        //local variables
        Vehicle target_vehicle;
        String output_string;

        //For every vehicle in the vehicle array, access its toString method and print out details
        for (int index = 0; index < vehicleArray.size(); index++) {
            System.out.println("\n");
            System.out.println("Booking Item " + "(" + (index + 1) + ")\n");

            target_vehicle = vehicleArray.get(index);
            output_string = target_vehicle.toString();

            System.out.println(output_string);
        }
    }
    /**
     * Retrieves all capable actions from other ActionCapable classes
     */
    public void consoleMenu() {
        while (!user.getIsUserDone()) {
            List<Action> actions = new ArrayList<>();
            List<ActionCapable> actionCapables = new ArrayList<>();

            actionCapables.add(user);
            actionCapables.addAll(vehicleArray);
            for (ActionCapable actionCapable : actionCapables) {

                actions.addAll(actionCapable.allowableActions());
            }


            System.out.println("#########################################");
            Action action = Menu.showMenu(actions);
            System.out.println(action.execute(user, this));
        }
    }


}