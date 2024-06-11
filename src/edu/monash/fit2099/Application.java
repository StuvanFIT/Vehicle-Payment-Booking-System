//Name:Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099;
import edu.monash.fit2099.bookings.BookingSystem;

/**
 * <h1>Application</h1>
 * Application is the driver to run the program
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class Application {

    /**
     *This instantiates a BookingSystem for the program to use
     * @param args
     * @return No return value
     */
    public static void main(String[] args) {

        //Creating Booking System Instance:
        BookingSystem bookSys = new BookingSystem();

        //Calling  printStatus method from BookingSystem:
        bookSys.printStatus();

    }
}
