//Name:Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099.actions;
import edu.monash.fit2099.bookings.User;
import edu.monash.fit2099.interfaces.Action;
import edu.monash.fit2099.bookings.BookingSystem;

/**
 * <h1>ConfirmAction</h1>
 * Confirms bookings in the booking list and displays total cost of booking
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class ConfirmAction implements Action {


    /**
     * The execute method contains all the logic needed to perform the actual action: confirms all bookings
     * @param user the current user in system
     * @param bookingSystem current BookingSystem used for the system
     * @return a String that represents a message to inform end-user and to be displayed in console
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem) {

        double total_price = user.confirmBookings();

        return String.format("Bookings have been confirmed and approved!\n" +
                "A total price of $%.2f has been deducted from your balance. You have $%.2f remaining",total_price,user.getBalance());
    }

    /**
     * Serves for the action itself to contain the information about how it will be shown in terminal
     * @return a String that represents a display message
     */
    @Override
    public String menuDescription() {
        return "Confirm Bookings.";
    }
}
