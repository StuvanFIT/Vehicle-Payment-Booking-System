//Name: Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099.interfaces;
import edu.monash.fit2099.bookings.User;
import edu.monash.fit2099.bookings.BookingSystem;

/**
 * <h1>Action</h1>
 * This interface serves as a contract for classes that implement Action. Allows classes to perform specific actions on a
 * particular object or displaying to terminal
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public interface Action {

    /**
     * The execute method contains all the logic needed to perform the actual action,
     * @param user the current user in system
     * @param bookingSystem current BookingSystem used for the system
     * @return a String that represents a message to inform end-user and to be displayed in console
     */
    public String execute(User user, BookingSystem bookingSystem);

    /**
     * Serves for the action itself to contain the information about how it will be shown as an option in a text-based Menu.
     * @return a String that represents a display message in menu option screen
     */
    public String menuDescription();

}