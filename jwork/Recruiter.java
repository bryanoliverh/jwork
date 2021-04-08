/**
 * Class Recruiter
 *
 * @author Bryan Oliver
 * @version 18.3.2021
 */

public class Recruiter
{
    // instance variabel untuk recruiter
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
/**
 * Class Recruiter
 *
 * inisiasi variabel untuk id, name, email, phoneNumber, dan location
 */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location )
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
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
 * method getPhoneNumber()
 * getter untuk memperoleh nilai phoneNumber
 * @return phoneNumber menampilkan objek phoneNumber
 */
     public String getPhoneNumber()
    {
        return phoneNumber;
    }
/**
 * method getLocation()
 * getter untuk memperoleh nilai location
 * @return phoneNumber menampilkan objek location
 */   
    public Location getLocation()
    {
        return location;
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
 * method setEmail()
 * setter untuk menetapkan nilai email
 * @param email berisi objek email
 */
    public void setEmail(String email)
    {
        this.email = email;
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
 * method setPhoneNumber()
 * setter untuk menetapkan nilai phoneNumber
 * @param phoneNumber berisi objek phoneNumber
 */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
/**
 * method setLocation()
 * setter untuk menetapkan nilai location
 * @param location berisi objek location
 */
    public void setLocation(Location location)
    {
        this.location = location;
    }
/**
 * method printData()
 * print nilai dari objek name
 */
    @Override
    public String toString() {
        return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPhone Number = "
                + getPhoneNumber() + "\nLocation = " + getLocation();
    }
}

