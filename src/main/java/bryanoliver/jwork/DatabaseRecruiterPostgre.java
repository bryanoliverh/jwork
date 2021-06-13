package bryanoliver.jwork;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static bryanoliver.jwork.DatabaseConnection.connection;
/**
 * Class DatabaseRecruiterPostgre
 *
 * @author Bryan Oliver
 * @version 10.6.2021
 */

public class DatabaseRecruiterPostgre {
    private static Connection c = null;
    private static Statement stmt = null;

    /**
     * add recruiter
     *
     * @param recruiter
     * @return
     */
    public static Recruiter addRecruiter(Recruiter recruiter) {
        c = connection();
        try {
            stmt = c.createStatement();
            int id = recruiter.getId();
            String name = recruiter.getName();
            String email = recruiter.getEmail();
            String phoneNumber = recruiter.getPhoneNumber();
            String province = recruiter.getLocation().getProvince();
            String city = recruiter.getLocation().getCity();
            String description = recruiter.getLocation().getDescription();
            Location location = new Location(id,province, city, description);
            String query = "INSERT INTO recruiter (id, name, email, phoneNumber, location)"
                    + "VALUES (" + id + ",'" + name + "','" + email + "','" + phoneNumber + "',ROW('" + province + "','"+city+"','"+description+"'));";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
            return null;
        }
        return recruiter;
    }


    /**
     * getter to obtain last id
     *
     * @return
     */
    public static int getLastId() {
        int value = 0;
        c = connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX (id) FROM recruiter;");
            while (rs.next()) {
                value = rs.getInt("max");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return value;
    }


    /**
     * Method to obtain recruiter by id
     * @param id
     *
     */
    public static Recruiter getRecruiterById(int id) {
        Recruiter recruiter = null;
        Location location =null;
        c = connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM recruiter WHERE id = "+ id + ";");
            while (rs.next()) {
                id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");
                String province = rs.getString("(location).province");
                String city = rs.getString("(location).city");
                String description = rs.getString("(location).description");
                location = new Location (id, province, city, description);

                recruiter = new Recruiter(id, name, email, phoneNumber, location);
            }
            stmt.close();
            c.close();

        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return recruiter;
    }

    /**
     * Method for deleting jobseekr data based on id
     * @param id
     *
     */
    public static boolean removeRecruiter(int id) {
        c = connection();
        try {
            stmt = c.createStatement();
            String query = "DELETE * FROM recruiter WHERE id = \"+id+\";\"";
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
     * Method to obtain  recruiter data from login info
     * @param emailParam
     * @param phoneNumberParam
     *
     */
    public static Recruiter getRecruiterLogin(String emailParam, String phoneNumberParam) {
        Connection c = connection();
        PreparedStatement stmt;
        Recruiter recruiter;
        int id = 0;
        String name = null;
        String email = null;
        String phoneNumber = null;
        Location location =null;
        Calendar cal = null;
        try {
            c.setAutoCommit(false);
            String sql = "SELECT * FROM recruiter WHERE email = '" + emailParam + "' AND phoneNumber = '" + phoneNumberParam + "';";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                phoneNumber = rs.getString("phoneNumber");
                String province = rs.getString("(location).province");
                String city = rs.getString("(location).city");
                String description = rs.getString("(location).description");
                location = new Location (id,province, city, description);

            }
            rs.close();
            stmt.close();
            c.close();
            //Check if response is null
            if (id == 0) {
                return null;
            } else {
                recruiter = new Recruiter(id, name, email, phoneNumber, location);
                return recruiter;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Method to obtain all recruiter data on database
     *
     */
    public static ArrayList<Recruiter> getRecruiterDatabase() {
        ArrayList<Recruiter> recruiters = new ArrayList<>();
        Recruiter value = null;
        Location location =null;
        Connection c = connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM recruiter;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String province = rs.getString("(location).province");
                String city = rs.getString("(location).city");
                String description = rs.getString("(location).description");
                location = new Location (id,province, city, description);
                String phoneNumber = rs.getString("phoneNumber");
                value = new Recruiter(id, name, email, phoneNumber, location);
                recruiters.add(value);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return recruiters;
    }
}
