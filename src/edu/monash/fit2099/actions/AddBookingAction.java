//Name:Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024
package edu.monash.fit2099.actions;
import edu.monash.fit2099.bookings.*;
import edu.monash.fit2099.interfaces.Action;

/**
 * <h1>AddBookingAction</h1>
 * Adds Booking containing vehicle to booked list
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class AddBookingAction implements Action {

    private Booking myBooking;

    /**
     * Constructor method
     * @param myBooking booking with specific vehicle
     */
    public AddBookingAction(Booking myBooking){
        this.myBooking = myBooking;
    }


    /**
     * The execute method contains all the logic needed to perform the actual action: adds booking to booking list
     * @param user the current user in system
     * @param bookingSystem current BookingSystem used for the system
     * @return a String that represents a message to inform end-user and to be displayed in console
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem) {
        user.addBookings(this.myBooking);
        return "Added Vehicle Details:\n"+this.myBooking + " \nis successfully added to the Booking System!";
    }

    /**
     * Serves for the action itself to contain the information about how it will be shown in terminal
     * @return a String that represents a display message
     */
    @Override
    public String menuDescription() {
        return "Add the following vehicle to the Booking System:" +myBooking.toString();
    }
}