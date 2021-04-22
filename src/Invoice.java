import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Class Invoice
 *
 * @author Bryan Oliver
 * @version 22.4.2021
 */
public abstract class Invoice
{
    // instance variables untuk Invoice
    private int id;
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;


    /**
 * Constructor Invoice
 * @param id menunjukan pada id
     * @param idJob menunjukan pada idJob
     * @param date menunjukan pada date atau tanggal
     * @param totalFee menunjukan pada total dari fee
     * @param jobseeker menunjukan pada jobseeker
 */
    public Invoice(int id, ArrayList<Job> jobs,  Jobseeker jobseeker){
        this.id = id;
        this.jobs = jobs;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = InvoiceStatus.OnGoing;
        this.date = Calendar.getInstance();
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
 * method getJob()
 * getter untuk memperoleh nilai job
 * @return idJob menampilkan objek jov
 */
 public ArrayList<Job> getJobs(){
     return jobs;
 }
/**
 * method getDate()
 * getter untuk memperoleh nilai date
 * @return date menampilkan objek date
 */
    public Calendar getDate(){
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
 * menggunakan abstract
 */    
public abstract PaymentType getPaymentType();
/**
 * method getInvoiceStatus()
 * getter untuk memperoleh nilai invoiceStatus
 * @return invoiceStatus menampilkan objek invoiceStatus
 */    
public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
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
 * method setJob()
 * setter untuk menetapkan nilai job
 * @param job berisi objek job
 */
public void setJobs(ArrayList<Job> jobs){
    this.jobs = jobs;
}
/**
 * method setDate()
 * setter untuk menetapkan nilai date
 * @param date berisi objek date
 */
    public void setDate(Calendar date){
        this.date = Calendar.getInstance();
    }
 public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }
/**
 * method setTotalFee()
 * setter untuk menetapkan nilai totalFee
 * @param totalFee berisi objek totalFee
 */
    public abstract void setTotalFee();
/**
 * method setJobseeker()
 * setter untuk menetapkan nilai jobseeker
 * @param jobseeker berisi objek jobseeker
 */
    public void setJobseeker(Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
/**
 * method setInvoiceStatus()
 * setter untuk menetapkan nilai status
 * @param status berisi objek status
 */
    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
/**
 * method toString()
 * print nilai dari objek name
 */
public abstract String toString();
//@Override
   
    /*public String toString() {
    if (this.date == null) {
            return "Id = " + getId() + "\nJob = " + getJob() + "\nJobseeker = " + getJobseeker() + "\nInvoice Status= "+ getInvoiceStatus();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getDate().getTime());
            return "Id = " + getId() + "\nJob = " + getJob() + "\nJobseeker = " + getJobseeker() + "\nInvoice Status= "+ getInvoiceStatus();
        }
    }*/
}
