
/**
 * Class Invoice
 *
 * @author Bryan Oliver
 * @version 18.3.2021
 */
public class Invoice
{
    // instance variables untuk Invoice
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

 /**
 * Class Jobseeker
 *
 * inisiasi variabel untuk id, idJob, date, totalFee, jobseeker
 */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker){
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
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
 * method getJobseeker()
 * getter untuk memperoleh nilai jobseeker
 * @return jobseeker menampilkan objek jobseeker
 */
    public Jobseeker getJobseeker() {
        return jobseeker;
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
    * method printData()
 * print nilai dari objek totalFee
 */   
     public void printData() {
        System.out.println(getTotalFee());
    }
}
