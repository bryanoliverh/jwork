package bryanoliver.jwork;
/**
 * Class Location
 *
 * @author Bryan Oliver
 * @version 12-6-2021
 */
public class Location
{
    private  int id;
    private String province;
    private String city;
    private String description;
    /**
 * Class Location
 *
 * inisiasi variabel province, city, dan description
 */
    public Location(int id, String province, String city, String description)
    {
        this.id = id;
        this.province = province;
        this.city = city;
        this.description = description;
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
     * method setId()
     * setter untuk memperoleh nilai id
     * @@param id
     */
    public void setId(int id)
    {
        this.id = id;
    }
 /**
 * method getProvince()
 * getter untuk memperoleh nilai province
 * @return province menampilkan objek province
 */
    public String getProvince()
    {
        return province;
    }
 /**
 * method getCity()
 * getter untuk memperoleh nilai city
 * @return city menampilkan objek city
 */
    public String getCity()
    {
        return city;
    }
 /**
 * method getDescription()
 * getter untuk memperoleh nilai description
 * @return description menampilkan objek description
 */
    public String getDescription()
    {
        return description;
    }
 /**
 * method setProvince()
 * setter untuk menetapkan nilai province
 * @param province berisi objek province
 */
    public void setProvince(String province)
    {
        this.province = province;
    }
 /**
 * method setCity()
 * setter untuk menetapkan nilai city
 * @param city berisi objek city
 */
    public void setCity(String city)
    {
        this.city = city;
    }
 /**
 * method setDescription()
 * setter untuk menetapkan nilai city
 * @param description berisi objek description
 */
    public void setDescription(String description)
    {
        this.description = description;
    }
 /**
 * method toString()
 * print nilai dari objek province
 */
 @Override
    public String toString() {
        return "Id = " + getId() + "\nProvince = " + getProvince() + "\nCity = " + getCity() + "\nDescription = " + getDescription();
    }
}
