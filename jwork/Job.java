/**
 * Class Job
 *
 * @author Bryan Oliver
 * @version 25.3.2021
 */
public class Job
{
    // instance variables dari class Job
    private int id;
    private String name;
    private int fee;
    private Recruiter recruiter;
    private JobCategory category;
    
    
/**
 * Class Job
 *
 * inisiasi variabel untuk id, name, recruiter, fee, dan category
 * 
 */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category)
    {
        this.id = id;
        this.recruiter = recruiter;
        this.name = name;
        this.fee = fee;
        this.category = category;
    }
/**
 * method getId()
 * getter untuk memperoleh nilai id
 * @return id menampilkan objek id
 */
    public int getId()
    {
        return id;
    }
/**
 * method getName()
 * getter untuk memperoleh nilai name
 * @return name menampilkan objek name
 */
    public String getName()
    {
        return name;
    }
/**
 * method getFee()
 * getter untuk memperoleh nilai Fee
 * @return Fee menampilkan objek Fee
 */
    public int getFee()
    {
        return fee;
    }
/**
 * method getCategory()
 * getter untuk memperoleh nilai category
 * @return category menampilkan objek category
 */
    public JobCategory getCategory()
    {
        return category;
    }
/**
 * method getRecruiter()
 * getter untuk memperoleh nilai recruiter
 * @return recruiter menampilkan objek recruiter
 */
    public Recruiter getRecruiter()
    {
        return recruiter;
    }
/**
 * method setId()
 * setter untuk menetapkan nilai id
 * @param id berisi objek id
 */
    public void setId(int id)
    {
       this.id = id;
    }
/**
 * method setName()
 * setter untuk menetapkan nilai name
 * @param name berisi objek name
 */
    public void setName(String name)
    {
       this.name = name;
    }
/**
 * method setRecruiter()
 * setter untuk menetapkan nilai recruiter
 * @param recruiter berisi objek recruiter
 */
    public void setRecruiter(Recruiter recruiter)
    {
       this.recruiter = recruiter;
    }
/**
 * method setFee()
 * setter untuk menetapkan nilai Fee
 * @param Fee berisi objek Fee
 */
    public void setFee(int fee)
    {
        this.fee = fee;
    }
/**
 * method setCategory()
 * setter untuk menetapkan nilai category
 * @param category berisi objek category
 */
    public void setCategory(JobCategory category)
    {
        this.category = category;
    }
/**
 * method printData()
 * print nilai dari objek name
 */
    public void printData()
    {
        System.out.println("===================== JOB =====================");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Recruiter: " + recruiter.getName());
        System.out.println("City: " + recruiter.getLocation().getCity());
        System.out.println("Fee: " + fee);
        System.out.println("Category: " + category);
    }
}
