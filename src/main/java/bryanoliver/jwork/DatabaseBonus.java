package bryanoliver.jwork;
/**
 * Class Invoice
 *
 * @author Bryan Oliver
 * @version 22.4.2021
 */
import java.util.ArrayList;

public class DatabaseBonus {
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    /**
     * Getter for last id
     * @return LastId
     */
    public static int getLastId(){
        return lastId;
    }

    /**
     * Getter bonus by ID
     * @param id
     * @return
     * @throws BonusNotFoundException
     */
    public static Bonus getBonusById(int id) throws BonusNotFoundException {
        Bonus temp = null;

        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                temp = bonus;
                return temp;
            }
        }
        throw new BonusNotFoundException(id);
    }

    /**
     * Getter for bonus by refferral Code
     * @param refferalCode
     * @return
     */
    public static Bonus getBonusByRefferralCode(String refferalCode){
        Bonus status = null;

        for (Bonus bonus : BONUS_DATABASE) {
            if (refferalCode.equals(bonus.getReferralCode())) {
                status = bonus;
            }
        }
        return status;
    }

    /**
     * Add Bonus
     * @param bonus
     * @return
     * @throws ReferralCodeAlreadyExistsException
     */
    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for (Bonus element : BONUS_DATABASE) {
            if (element.getReferralCode() == bonus.getReferralCode()) {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    /**
     * Activate bonus
     * @param id
     * @return
     */
    public static boolean activateBonus(int id){
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                x = true;
            }
        }
        return x;
    }

    /**
     * Deactivate Bonus
     * @param id
     * @return
     */
    public static boolean deactivateBonus(int id){
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                x = true;
            }
        }
        return x;
    }
    public static boolean removeBonus(int id) throws BonusNotFoundException {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        throw new BonusNotFoundException(id);
    }
}