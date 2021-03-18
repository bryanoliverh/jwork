/**
 * Class Jobseeker
 *
 * @author Bryan Oliver
 * @version 18.3.2021
 */

public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    
/**
 * Class Jobseeker
 *
 * inisiasi variabel untuk id, name, email, password, dan joinDate
 */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
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
 * method getEmail()
 * getter untuk memperoleh nilai email
 * @return email menampilkan objek email
 */
    public String getEmail()
    {
        return email;
    }
/**
 * method getPassword()
 * getter untuk memperoleh nilai password
 * @return password menampilkan objek password
 */
    public String getPassword()
    {
        return password;
    }
/**
 * method getJoinDate()
 * getter untuk memperoleh nilai joinDate
 * @return joinDate menampilkan objek joinDate
 */
     public String getJoinDate()
    {
        return joinDate;
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
 * method setEmail()
 * setter untuk menetapkan nilai email
 * @param email berisi objek email
 */
    public void setEmail(String email)
    {
        this.email = email;
    }
/**
 * method setPassword()
 * setter untuk menetapkan nilai password
 * @param password berisi objek password
 */
    public void setPassword(String password)
    {
        this.password = password;
    }
/**
 * method setJoinDate()
 * setter untuk menetapkan nilai joinDate
 * @param joinDate berisi objek joinDate
 */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
 /**
 * method printData()
 * print nilai dari objek name
 */
    public void printData() {
        System.out.println(getName());
    }
}
