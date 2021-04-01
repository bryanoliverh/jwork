/**
 * Class Bonus
 *
 * @author Bryan Oliver
 * @version 01.4.2021
 */
public class Bonus {
    //instance variables
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;

     /**
 * Constructor Bonus
 * @param id menunjukan pada id
     * @param referralCode menunjukan pada referralCode
     * @param extraFee menunjukan pada fee tambahan
     * @param minTotalFee menunjukan pada minimum total dari fee
     * @param active menunjukan pada kondisi aktif bonus
 */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active) {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }
/**
 * public getId()
 * @return id 
 */
    public int getId() {
        return id;
    }
/**
 * public getReferralCode()
 * @return referralCode 
 */
    public String getReferralCode() {
        return referralCode;
    }
/**
 * public getExtraFee()
 * getter untuk extraFee
 * @return extraFee 
 */
    public int getExtraFee() {
        return extraFee;
    }
/**
 * public getMinTotalFee()
 * fungsi getter untuk minTotalFee
 * @return minTotalFee 
 */
    public int getMinTotalFee() {
        return minTotalFee;
    }
/**
 * public getActive()
 * fungsi getter untuk active
 * @return active 
 */
    public boolean getActive() {
        return active;
    }
/**
 * public setId()
 * fungsi setter untuk id
 * @return id
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * public setReferralCode()
 * fungsi setter untuk referralCode
 * @return referralCode 
 */
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }
/**
 * public setExtraFee()
 * fungsi setter untuk extraFee
 * @return extraFee 
 */
    public void setExtraFee(int extraFee) {
        this.extraFee = extraFee;
    }
/**
 * public setMinTotalFee()
 * fungsi setter untuk minTotalFee
 * @return minTotalFee 
 */
    public void setMinTotalFee(int minTotalFee) {
        this.minTotalFee = minTotalFee;
    }
/**
 * public setActive()
 * fungsi setter untuk active
 * @return active 
 */
    public void setActive(boolean active) {
        this.active = active;
    }
//metode printdata
    public void printData() {
        System.out.println("ID: " + id);
        System.out.println("Referral Code: " + referralCode);
        System.out.println("Extra Fee: " + extraFee);
        System.out.println("Min Total Fee: " + minTotalFee);
        System.out.println("Active: " + active);
    }

}
