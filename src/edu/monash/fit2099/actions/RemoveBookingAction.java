//Name:Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024
package edu.monash.fit2099.actions;
import edu.monash.fit2099.bookings.*;
import edu.monash.fit2099.interfaces.Action;


/**
 * <h1>RemoveBookingAction</h1>
 * Removes a specific Booking from the list of bookings of a specific user.
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class RemoveBookingAction implements Action {

    private Booking booking;

    /**
     * Constructor method
     * @param booking booking to be removed
     */
    public RemoveBookingAction(Booking booking){
        this.booking = booking;
    }

    /**
     * The execute method contains all the logic needed to perform the actual action: remove booking
     * @param user the current user in system
     * @param bookingSystem current BookingSystem used for the system
     * @return a String that represents a message to inform end-user and to be displayed in console
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem) {

        Boolean remove_Booking = user.removeBooking(booking);

        if (remove_Booking){
            return "eBooking has been successfully removed!";

        } else{

            return "ERROR:Booking was NOT removed!";
        }
    }

    /**
     * Serves for the action itself to contain the information about how it will be shown in terminal
     * @return a String that represents a display message
     */
    @Override
    public String menuDescription() {
        return String.format("Remove the following vehicle from the Booking System: %s", this.booking.toString());
    }
}
