import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Class Jobseeker
 *
 * @author Bryan Oliver
 * @version 08.4.2021
 */

public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    public Calendar joinDate;
    
/**
 * Class Jobseeker
 *constructor
 * inisiasi variabel untuk id, name, email, password, dan joinDate
  * @param id      untuk inisiasi id
     * @param name   untuk inisiasi name jobseeker
     * @param email  untuk inisiasi email
     * @param password untuk inisiasi password
     * @param joinDate untuk inisiasi joinDate
 */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }
 /**
 * Class Jobseeker
 *constructor
 * inisiasi variabel untuk id, name, email, password, dan year, serta month, dan dayOfMonth
 */   
public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month -1, dayOfMonth);
    }
 /**
 * Class Jobseeker
 *constructor
 * inisiasi variabel untuk id, name, email, password
 */   
      public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
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
     public Calendar getJoinDate()
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
    public void setEmail(String email){
        String regex = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            this.email = email;
        }
        else{
            this.email = "";
        }
    }
/**
 * method setPassword()
 * setter untuk menetapkan nilai password
 * @param password berisi objek password
 */
   public void setPassword(String password){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }
/**
 * method setJoinDate()
 * setter untuk menetapkan nilai joinDate
 * @param joinDate berisi objek joinDate
 */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }
/**
 * method setJoinDate() #2
 * setter untuk menetapkan nilai joinDate
 * @param year berisi objek year
 * @param month berisi objek month
 * @param dayOfMonth berisi objek hari dalam suatu bulan
 */
public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate.add(Calendar.MONTH,month);
        this.joinDate.add(Calendar.YEAR,year);
        this.joinDate.add(Calendar.DAY_OF_MONTH, dayOfMonth);
    }
 /**
 * method toString()
 * print nilai dari objek name
 */
@Override
   
    public String toString() {
    if (this.joinDate == null) {
            return "Id = " + getId() + "\nName = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "+ getPassword();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nName = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "+ getPassword() + "\nJoin Date = " + date;
        }    
    }
}
