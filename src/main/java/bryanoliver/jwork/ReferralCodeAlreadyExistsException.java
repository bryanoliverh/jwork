package bryanoliver.jwork;
/**
 * Exception Class ReferralCodeAlreadyExistsException
 *
 * @author Bryan Oliver
 * @version 10.6.2021
 */
public class ReferralCodeAlreadyExistsException extends Exception {

    private Bonus referral_error;

    /**
     * ReferralCodeAlreadyExistsException
     * @param referral_input
     */
    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Referral Code: ");
        this.referral_error = referral_input;
    }

    /**
     * get message to accommodate referral error
     * @return
     */
    @Override
    public String getMessage() {
        return super.getMessage() + referral_error.getReferralCode() + " not found";
    }
}