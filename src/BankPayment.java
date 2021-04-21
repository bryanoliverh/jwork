import java.text.SimpleDateFormat;

/**
 * Class BankPayment
 *
 * @author Bryan Oliver
 * @version 01.4.2021
 */
public class BankPayment extends Invoice {
    
    private int adminFee;
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;

    public BankPayment(int id, Job job,  Jobseeker jobseeker,
        InvoiceStatus invoiceStatus){
        super(id, job, jobseeker, invoiceStatus);
    }
     public BankPayment(int id, Job job, Jobseeker jobseeker,
            InvoiceStatus invoiceStatus, int adminFee) {
        super(id, job, jobseeker, invoiceStatus);
        this.setAdminFee(adminFee);
    }
    
    @Override
    public PaymentType getPaymentType() {
        
        return PAYMENT_TYPE;
    }
    public int getAdminFee() {
        return adminFee;
    }
    
    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }
    @Override
   public void setTotalFee() {
        if (adminFee != 0) {
            super.totalFee = getJob().getFee() - adminFee;
        } else {
            super.totalFee = getJob().getFee();

        }


    }
@Override
 public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());

        if (adminFee != 0){
            return ("Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }else{
            return ("Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                + getJobseeker().getName()+ "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }
    }
}

    
