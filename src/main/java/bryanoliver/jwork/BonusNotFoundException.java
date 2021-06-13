package bryanoliver.jwork;
/**
 * Exception Class BonusNotFoundException
 *
 * @author Bryan Oliver
 * @version 22.4.2021
 */
public class BonusNotFoundException extends Exception {
    private int bonus_error;

    /**
     * Exception when Bonus not Found
     * @param bonus_input
     */

    public BonusNotFoundException(int bonus_input){
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }

    public String getMessage() {
        return super.getMessage() + bonus_error + " not found";
    }
}