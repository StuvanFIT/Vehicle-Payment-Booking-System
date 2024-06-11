//Name: Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099.interfaces;

/**
 * <h1>Payment</h1>
 * Payment represents a payment service that is used by the User to add balance to the current balance.
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public interface Payment {

    /**
     * processPayment validates the amount being put into the balance
     * @param amount double value to be added into user's balance
     * @return a boolean value; true if amount to be added is valid or false if not valid
     */
    public boolean processPayment(double amount);

    /**
     * Returns the text representation of the payment method
     * @return a String that represents the name of the payment service
     */
    public String toString();

}
