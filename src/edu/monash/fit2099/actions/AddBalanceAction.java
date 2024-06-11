//Name: Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099.actions;
import edu.monash.fit2099.bookings.User;
import edu.monash.fit2099.interfaces.Action;
import edu.monash.fit2099.bookings.BookingSystem;
import edu.monash.fit2099.interfaces.Payment;
import java.util.*;


/**
 * <h1>AddBalanceAction</h1>
 * Adds balance amount to the User's balance via a payment service
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class AddBalanceAction implements Action {

    private Payment payment;

    /**
     * Constructor method
     * @param paymentType the payment service selected by end user
     */
    public AddBalanceAction(Payment paymentType){
        this.payment = paymentType;

    }


    /**
     * The execute method contains all the logic needed to perform the actual action: adding balance to user's balance
     * @param user the current user in system
     * @param bookingSystem current BookingSystem used for the system
     * @return a String that represents a message to inform end-user and to be displayed in console
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem){

        Scanner scanner = new Scanner(System.in); //Creates a new scanner object

        System.out.println("Enter a number to add to your current balance: ");

        float balance = Float.parseFloat(scanner.nextLine()); //Read the user input (must enter a float)

        //Process the amount: check if it is valid
        boolean result = this.payment.processPayment(balance);

        if(result){
            user.addBalance(balance);
            return String.format("%.2f is added to the user balance!", balance);
        }else{
            return "Failed to add to the user balance";
        }

    }
    /**
     * Serves for the action itself to contain the information about how it will be shown in terminal
     * @return a String that represents a display message
     */
    @Override
    public String menuDescription(){
        return String.format("Add balance with %s",this.payment.toString());

    }

}
