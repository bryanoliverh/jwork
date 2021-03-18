
/**
 * Class Location
 *
 * @author Bryan Oliver
 * @version 18 Maret 2021
 */
public class Location
{
    private String province;
    private String city;
    private String description;
    /**
 * Class Location
 *
 * inisiasi variabel province, city, dan description
 */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
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
 * method printData()
 * print nilai dari objek province
 */
   public void printData() {
       System.out.println(getProvince());
    }
}
