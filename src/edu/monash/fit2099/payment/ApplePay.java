//Name: Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099.payment;
import edu.monash.fit2099.interfaces.Payment;


/**
 * <h1>ApplePay</h1>
 * ApplePay is a payment service that is used by the User to add balance to the current balance.
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class ApplePay implements Payment {

    //The payment limit is only for the apple_pay, so there is no need for it to be public
    //declare constants in a class that should not be modified
    //private: only relevant to Apple Pay
    //static: only relevant for Apple Pay instances, also saves memory as it stays in the memory throughout lifetime of application
    private static final double PAYMENT_LIMIT = 1000;


    /**
     * processPayment validates the amount being put into the balance.
     * @param amount double value to be added into user's balance
     * @return a boolean value; true if amount to be added is valid or false if not valid (if the amount is over payment limit)
     */
    @Override
    public boolean processPayment(double amount){

        //If user payment amount > limit:
        if (amount > PAYMENT_LIMIT){
            System.out.println(String.format("ERROR: Limit exceeded for payment of $%.2f", amount));
            return false;
        }
        //If user payment amount is valid <=limit:
        else {
            System.out.println(String.format("Payment processed by Apple Pay: $%.2f",amount));
            return true;
        }
    }

    /**
     * Returns the text representation of the payment method
     * @return a String that represents the name of the payment service
     */
    @Override
    public String toString(){
        return "ApplePay";
    }


}


