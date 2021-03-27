
/**
 * Class Invoice
 *
 * @author Bryan Oliver
 * @version 27.3.2021
 */
public class Invoice
{
    // instance variables untuk Invoice
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private InvoiceStatus status;

 /**
 * Class Jobseeker
 *
 * inisiasi variabel untuk id, idJob, date, totalFee, jobseeker
 */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status){
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
    }
 /**
 * method getId()
 * getter untuk memperoleh nilai id
 * @return id menampilkan objek id
 */
    public int getId(){
        return id;
    }
 /**
 * method getIdJob()
 * getter untuk memperoleh nilai idJob
 * @return idJob menampilkan objek idJov
 */
    public int getIdJob(){
        return idJob;
    }
/**
 * method getDate()
 * getter untuk memperoleh nilai date
 * @return date menampilkan objek date
 */
    public String getDate(){
        return date;
    }
/**
 * method getTotalFee()
 * getter untuk memperoleh nilai totalFee
 * @return totalFee menampilkan objek totalFee
 */
    public int getTotalFee(){
        return totalFee;
    }
/**
 * method getJobseeker()
 * getter untuk memperoleh nilai jobseeker
 * @return jobseeker menampilkan objek jobseeker
 */
    public Jobseeker getJobseeker() {
        return jobseeker;
    }
/**
 * method getPaymentType()
 * getter untuk memperoleh nilai PaymentType
 * @return PaymentType menampilkan objek PaymentType
 */    
public PaymentType getPaymentType() {
        return paymentType;
    }
/**
 * method getInvoiceStatus()
 * getter untuk memperoleh nilai InvoiceStatus
 * @return InvoiceStatus menampilkan objek InvoiceStatus
 */    
public InvoiceStatus getInvoiceStatus() {
        return status;
    }
/**
 * method setId()
 * setter untuk menetapkan nilai id
 * @param id berisi objek id
 */   
    public void setId(int id){
        this.id = id;
    }
/**
 * method setIdJobs()
 * setter untuk menetapkan nilai idJobs
 * @param idJobs berisi objek idJobs
 */  
    public void setIdJobs(int idJobs){
        this.idJob = idJobs;
    }
/**
 * method setDate()
 * setter untuk menetapkan nilai date
 * @param date berisi objek date
 */
    public void setDate(String date){
        this.date = date;
    }
/**
 * method setTotalFee()
 * setter untuk menetapkan nilai totalFee
 * @param totalFee berisi objek totalFee
 */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }

/**
 * method setJobseeker()
 * setter untuk menetapkan nilai jobseeker
 * @param jobseeker berisi objek jobseeker
 */
    public void setJobseeker(Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
/**
 * method setPaymentType()
 * setter untuk menetapkan nilai paymentType
 * @param paymentType berisi objek paymentType
 */
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
/**
 * method setInvoiceStatus()
 * setter untuk menetapkan nilai status
 * @param status berisi objek status
 */
    public void setInvoiceStatus(InvoiceStatus status) {
        this.status = status;
    }
/**
    * method printData()
 * print nilai dari objek totalFee
 */   
public void printData()
    {
        System.out.println("===================== Invoice =====================");
        System.out.println("ID: " + id);
        System.out.println("ID Job: " + idJob);
        System.out.println("Date: " + date);
        System.out.println("Seeker: " + jobseeker.getName());
        System.out.println("Fee: " + totalFee);
        System.out.println("Status: " + status);
    }
}
