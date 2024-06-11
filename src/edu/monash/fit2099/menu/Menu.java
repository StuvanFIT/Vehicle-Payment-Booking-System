//Name:Steven Kaing
//ID: 33155666
//Last Modified: 04/04/2024

package edu.monash.fit2099.menu;
import edu.monash.fit2099.interfaces.Action;
import java.util.*;

/**
 * <h1>Menu<h1>
 * Menu class to display options and allow interative functionality with end-user
 * @author Steven Kaing
 * @version 1.0.0
 * @since 04/04/2024
 */
public class Menu {

    /**
     * Displays menu screen for end-user to interact with. Retrieves the actions from each ActionCapable class and displays them
     * as options in menu screen
     * @param actions  a list of actions to be shown in menu screen
     * @return an Action chosen by the user and to be executed
     */
    public static Action showMenu(List<Action> actions) {
        Scanner scanner = new Scanner(System.in);
        List<Character> freeChars = new ArrayList<Character>();
        Map<Character, Action> keyToActionMap = new HashMap<>();


        for (char j = 'a'; j <= 'z'; j++) {
            freeChars.add(j);
        }


        for (Action action : actions) {
            char c = freeChars.get(0);
            freeChars.remove(Character.valueOf(c));
            keyToActionMap.put(c, action);
            System.out.println(c + ": " + action.menuDescription());
        }


        char key;
        do {
            key = scanner.next().charAt(0);
        } while (!keyToActionMap.containsKey(key));


        return keyToActionMap.get(key);
    }
}

