//Name: Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099.utils;
import java.util.Random;

/**
 * <h1>Utility</h1>
 * utility class to generate a random integer value
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class Utility {

    /**
     * This method generates a random integer in a specific range (lower, upper)
     * @param lower lower bound of random generator (inclusive)
     * @param upper higher bound of random generator (exclusive)
     * @return an integer value
     */
    public static int generateRandomInt(int lower, int upper){

        //Create instance of the random class:
        Random random =  new Random();

        int number =  random.nextInt((upper - lower)+1) + lower;

        return number;

    }


}
