package bryanoliver.jwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static bryanoliver.jwork.DatabaseConnection.connection;
public class DatabaseRecruiterPostgreLocid {

    /**
     * Method to add recruiter to db
     * @param recruiter
     * @return recruiter when success
     */
    public static Recruiter addRecruiter(Recruiter recruiter) {
        Connection c = connection();
        PreparedStatement stmt;
        try {
            c.setAutoCommit(false);
            int id = recruiter.getId();
            String name = recruiter.getName();
            String email = recruiter.getEmail();
            String phoneNumber = recruiter.getPhoneNumber();
            int locationId = recruiter.getLocation().getId();
            String sql = "INSERT INTO recruiter (id, name, email, phoneNumber, locationId) VALUES ('"+id+"','"+name+"','"+email+"','"+phoneNumber+"','"+locationId+"');";
            stmt = c.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            c.commit();
            c.close();
            return recruiter;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Method to get last id of recruiter
     * @return last id recruiter
     */
    public static int getLastId(){
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        try {
            String sql = "SELECT MAX(id) from recruiter;";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt(1);
            }
            stmt.close();
            c.close();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    /**
     * Method to get recruiter based on recruiter id
     * @param id_recruiter for recruiter id
     * @return recruiter when success
     */
    public static Recruiter getRecruiterById(int id_recruiter){
        Connection c = connection();
        PreparedStatement stmt;
        Recruiter recruiter = null;
        int id = 0;
        String name = null;
        String email = null;
        String phoneNumber = null;
        int locationId = 0;
        try {
            String sql = "SELECT * FROM recruiter WHERE id = '"+id_recruiter+"';";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
                name = rs.getString("name");
                email  = rs.getString("email");
                phoneNumber = rs.getString("phoneNumber");
                locationId = rs.getInt("locationId");
            }
            rs.close();
            stmt.close();
            c.close();
            recruiter = new Recruiter(id, name, email, phoneNumber, DatabaseLocationPostgre.getLocationById(locationId));
            return recruiter;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * Method for remove recruiter using recruiter id
     * @param id id of recruiter
     */
    public void removeCustomer(int id){
        Connection c = connection();
        PreparedStatement stmt;
        try {
            String sql = "DELETE FROM recruiter WHERE id = "+id+";";
            stmt = c.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
