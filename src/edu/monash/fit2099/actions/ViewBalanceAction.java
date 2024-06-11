//Name:Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099.actions;
import edu.monash.fit2099.interfaces.Action;
import edu.monash.fit2099.bookings.BookingSystem;
import edu.monash.fit2099.bookings.User;


/**
 * <h1>ViewBalanceAction</h1>
 * Displays a message showing the current balance in the User's balance.
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class ViewBalanceAction implements Action {

    /**
     * The execute method contains all the logic needed to perform the actual action: displays balance amount
     * @param user the current user in system
     * @param bookingSystem current BookingSystem used for the system
     * @return a String that represents a message to inform end-user and to be displayed in console
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem){
        return String.format("You have a balance of $%.4f", user.getBalance());
    }

    /**
     * Serves for the action itself to contain the information about how it will be shown in terminal
     * @return a String that represents a display message
     */
    @Override
    public String menuDescription() {
        return "View Balance.";
    }


}
