package bryanoliver.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Class BankPayment
 *
 * @author Bryan Oliver
 * @version 22.4.2021
 */

public class BankPayment extends Invoice{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * constructor bankpayment
     * @param id
     * @param jobs
     * @param jobseeker
     */

    public BankPayment(int id, ArrayList<Job> jobs,  Jobseeker jobseeker){
        super(id, jobs, jobseeker);
    }
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee) {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee;
    }
    @Override
    public void setTotalFee() {
        for(Job job : getJobs()) {
            if(adminFee != 0) {
                totalFee = job.getFee() - getAdminFee();
            }
            else {
                totalFee = job.getFee();
            }
        }
    }

    /**
     * getpaymenttype function to get the payment type (bank or ewallet)
     * @return PAYMENT_TYPE
     */
    @Override
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    /**
     *getAdminFee
     * @return adminFee
     */
    public int getAdminFee() {
        return adminFee;
    }

    /**
     *setter for admin fee
     * @param adminFee
     */

    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }

    /**
     * toString function to give the necessary objects
     * @return res
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        String res = "";
        for (Job job : getJobs()) {
            if (adminFee != 0) {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            } else {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            }
        }
        return res;
    }
}
