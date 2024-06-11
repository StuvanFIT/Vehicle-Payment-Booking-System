//Name: Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099.payment;
import edu.monash.fit2099.interfaces.Payment;

/**
 * <h1>GooglePay</h1>
 * GooglePay is a payment service that is used by the User to add balance to the current balance.
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class GooglePay implements Payment {

    /**
     * processPayment validates the amount being put into the balance.
     * @param amount double value to be added into user's balance
     * @return a boolean value; true if amount to be added is valid or false if not valid
     */
    @Override
    public boolean processPayment(double amount){
        System.out.println(String.format("Payment processed by Google Pay: $%.2f",amount));
        return true;
    }
    /**
     * Returns the text representation of the payment method
     * @return a String that represents the name of the payment service
     */
    @Override
    public String toString(){
        return "GooglePay";
    }

}