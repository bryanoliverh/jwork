package bryanoliver.jwork;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static bryanoliver.jwork.DatabaseConnection.connection;

/**
 * Class DatabaseLocationPostgre
 *
 * @author Bryan Oliver
 * @version 12.6.2021
 */
public class DatabaseLocationPostgre {
    private static Connection c = null;
    private static Statement stmt = null;
    /**
     * Method to add location
     */
    public static Location addLocation (Location location) {
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            int id = location.getId();
            String province = location.getProvince();
            String city = location.getCity();
            String description = location.getDescription();

            String query =  "INSERT INTO location (id, province, city, description)"
                    + "VALUES ("+id+ ",'"+ province + "','"+ city + "','"+ description + "');";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
            return null;
        }
        return location;
    }



    /**
     * Method for deleting location based on city
     * @param city
     *
     */
    public static boolean removeLocation(String city) {
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            String query = "DELETE * FROM location WHERE city = \"+city+\";\"";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return true;
    }


    /**
     * Method to obtain all location data on database
     *
     */
    public static ArrayList<Location> getLocationDatabase() {
        ArrayList<Location> location = new ArrayList<>();
        Location value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM location;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String province = rs.getString("province");
                String city = rs.getString("city");
                String description = rs.getString("description");
                value = new Location(id, province, city, description);
                location.add(value);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return location;
    }
    /**
     * Method for getting location based on description
     * @param id
     *
     */
    public static Location getLocationById(int id) {
        Location value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM location WHERE id = '"+ id + "' ;");
            while (rs.next()) {
                id = rs.getInt("id");
                String province = rs.getString("province");
                String city = rs.getString("city");
                String description = rs.getString("description");
                value = new Location(id,province, city, description);
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }
    /**
     * Method to obtain all location data on database based on province
     * @param province
     */
    public static Location getLocationByProvince(String province) {
        Location value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM location WHERE province = '"+ province + "' ;");
            while (rs.next()) {
                int id = rs.getInt("id");
                province = rs.getString("province");
                String city = rs.getString("city");
                String description = rs.getString("description");
                value = new Location(id,province, city, description);
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }
    /**
     * Method for getting location based on city
     * @param city
     *
     */
    public static Location getLocationByCity(String city) {
        Location value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM location WHERE city = '"+ city + "' ;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String province = rs.getString("province");
                city = rs.getString("city");
                String description = rs.getString("description");
                value = new Location(id,province, city, description);
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }
    /**
     * Method for getting location based on description
     * @param description
     *
     */
    public static Location getLocationByDescription(String description) {
        Location value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM location WHERE description = '"+ description + "' ;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String province = rs.getString("province");
                String city = rs.getString("city");
                description = rs.getString("description");
                value = new Location(id,province, city, description);
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }
    /**
     * Getter fr Last Id in database
     * @return
     */
    public static int getLastId() {
        int value = 0;
        c = connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX (id) FROM location;");
            while (rs.next()) {
                value = rs.getInt("max");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }
}



