//Name:Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024


package edu.monash.fit2099.actions;
import edu.monash.fit2099.bookings.User;
import edu.monash.fit2099.interfaces.Action;
import edu.monash.fit2099.bookings.BookingSystem;

/**
 * <h1>ExitAction</h1>
 *Sets the isUserDone attribute in the User class to True.
 *Indicates that the user does not wish to perform any other action and would like to exit the system
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class ExitAction implements Action {


    /**
     * The execute method contains all the logic needed to perform the actual action: set isUserDone to TRUE
     * @param user the current user in system
     * @param bookingSystem current BookingSystem used for the system
     * @return a String that represents a message to inform end-user and to be displayed in console
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem) {

        user.setUserDone(true);
        return "User has exited System.........";
    }

    /**
     * Serves for the action itself to contain the information about how it will be shown in terminal
     * @return a String that represents a display message
     */
    @Override
    public String menuDescription() {
        return "Exit the System.";
    }
}
