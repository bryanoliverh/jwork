package bryanoliver.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;
import java.util.Random;

/**
 *  Class JWork
 *
 * @author Bryan Oliver
 * @version 10.6.2021
 */
@SpringBootApplication
public class JWork {
    /**
     * Main function to create object
     * @param args
     */
    public static void main(String[] args) {
        //random function to create random bonus name and random extra fee in bonus
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
        String value2 = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        StringBuilder olr = new StringBuilder();
        Random rndo = new Random();
        while (olr.length() < 5) {
            int index = (int) (rndo.nextFloat() * SALTCHARS.length());
            olr.append(SALTCHARS.charAt(index));
        }
        StringBuilder har = new StringBuilder();
        Random hart = new Random();
        while (har.length() < 5) {
            int index = (int) (hart.nextFloat() * SALTCHARS.length());
            har.append(SALTCHARS.charAt(index));
        }
        StringBuilder val3 = new StringBuilder();
        Random randomint = new Random();
        while (val3.length() < 4) {
            int index = (int) (randomint.nextFloat() * value2.length());
            val3.append(value2.charAt(index));
        }
        StringBuilder val5 = new StringBuilder();
        Random randomint5 = new Random();
        while (val5.length() < 5) {
            int index = (int) (randomint5.nextFloat() * value2.length());
            val5.append(value2.charAt(index));
        }
        StringBuilder val7 = new StringBuilder();
        Random randomint7 = new Random();
        while (val7.length() < 5) {
            int index = (int) (randomint7.nextFloat() * value2.length());
            val7.append(value2.charAt(index));
        }
        String bryanrandom = salt.toString();
        String oliverrandom = olr.toString();
        String hartonorandom = har.toString();
        String bryanintstring = val3.toString();
        int bryanintfinal = Integer.parseInt(bryanintstring);
        String oliverintstring = val5.toString();
        int oliverintfinal = Integer.parseInt(oliverintstring);
        String hartonointstring = val5.toString();
        int hartonointfinal = Integer.parseInt(hartonointstring);




        SpringApplication.run(JWork.class, args);

////            Location location1 = new Location(1,"California", "LA", "Lakers");
////            Location locationnew = new Location(2, "Texas", "Phoenix", "Suns");
////            Location location3 = new Location(3, "New York", "Manhattan", "MSG");
//            DatabaseLocationPostgre.addLocation(new Location( 1,"California", "LA" , "Lakers"));
//            DatabaseLocationPostgre.addLocation(new Location(2, "Texas", "Phoenix", "Suns"));
//            DatabaseLocationPostgre.addLocation(new Location(3, "NewYork", "Manhattan", "Knicks"));
//            DatabaseLocationPostgre.addLocation(new Location( 4, "Wisconsin", "Milwauke", "Bucks"));
//            DatabaseLocationPostgre.addLocation(new Location( 5, "NewYork", "Brooklyn", "Nets"));



//try{
//        DatabaseRecruiterPostgre.addRecruiter(new Recruiter(DatabaseRecruiterPostgre.getLastId() + 1, "Bryan", "bryan.oliver@ui.ac.id", "0821212193", DatabaseLocationPostgre.getLocationById(4)));
//        DatabaseRecruiterPostgre.addRecruiter(new Recruiter(DatabaseRecruiterPostgre.getLastId() + 1, "Oliver", "ilhan.rafid@ui.ac.id", "081234567890", DatabaseLocationPostgre.getLocationById(2)));
//        DatabaseRecruiterPostgre.addRecruiter(new Recruiter(DatabaseRecruiterPostgre.getLastId() + 1, "Hartono", "oliver.hartono@ui.ac.id", "01233456", DatabaseLocationPostgre.getLocationById(3)));
//        DatabaseRecruiterPostgre.addRecruiter(new Recruiter(DatabaseRecruiterPostgre.getLastId() + 1, "Lebron James", "lebronjames@ui.ac.id", "0231233456", DatabaseLocationPostgre.getLocationById(1)));
//        DatabaseRecruiterPostgre.addRecruiter(new Recruiter(DatabaseRecruiterPostgre.getLastId() + 1, "Kevin Durant", "kevind35@ui.ac.id", "030303030", DatabaseLocationPostgre.getLocationById(5)));

//    } catch (Exception e) {
//        e.printStackTrace();
//    }


try{
        DatabaseRecruiterPostgreLocid.addRecruiter(new Recruiter(DatabaseRecruiterPostgreLocid.getLastId() + 1, "Bryan", "bryan.oliver@ui.ac.id", "0821212193", DatabaseLocationPostgre.getLocationById(4)));
        DatabaseRecruiterPostgreLocid.addRecruiter(new Recruiter(DatabaseRecruiterPostgreLocid.getLastId() + 1, "Oliver", "ilhan.rafid@ui.ac.id", "081234567890", DatabaseLocationPostgre.getLocationById(2)));
        DatabaseRecruiterPostgreLocid.addRecruiter(new Recruiter(DatabaseRecruiterPostgreLocid.getLastId() + 1, "Hartono", "oliver.hartono@ui.ac.id", "01233456", DatabaseLocationPostgre.getLocationById(3)));
        DatabaseRecruiterPostgreLocid.addRecruiter(new Recruiter(DatabaseRecruiterPostgreLocid.getLastId() + 1, "Lebron James", "lebronjames@ui.ac.id", "0231233456", DatabaseLocationPostgre.getLocationById(1)));
        DatabaseRecruiterPostgreLocid.addRecruiter(new Recruiter(DatabaseRecruiterPostgreLocid.getLastId() + 1, "Kevin Durant", "kevind35@ui.ac.id", "030303030", DatabaseLocationPostgre.getLocationById(5)));

    } catch (Exception e) {
        e.printStackTrace();
    }


        try{
            DatabaseJob.addJob(new Job(1, "Database Engineer", DatabaseRecruiterPostgreLocid.getRecruiterById(1), 100000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "GCP Analyst", DatabaseRecruiterPostgreLocid.getRecruiterById(2), 200000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(3, "UI UX", DatabaseRecruiterPostgreLocid.getRecruiterById(3), 300000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(4, "Business Intelligence", DatabaseRecruiterPostgreLocid.getRecruiterById(3), 300000, JobCategory.DataAnalyst));
            DatabaseJob.addJob(new Job(5, "Business Analitics", DatabaseRecruiterPostgreLocid.getRecruiterById(4), 500000, JobCategory.DataAnalyst));
            DatabaseJob.addJob(new Job(5, "UI Analyst", DatabaseRecruiterPostgreLocid.getRecruiterById(5), 510000, JobCategory.FrontEnd));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //DatabaseBonusPostgre.addBonus(new Bonus(1, "bonusbryan", 770, 1000, true));
            //DatabaseBonusPostgre.addBonus(new Bonus(2, "kerenbryan", 9999, 20000, true));
            DatabaseBonusPostgre.addBonus(new Bonus(DatabaseBonusPostgre.getLastId() + 1, "bryan" + bryanrandom, 9999 + bryanintfinal, 50000, true));
            DatabaseBonusPostgre.addBonus(new Bonus(DatabaseBonusPostgre.getLastId() + 1, "oliver" + oliverrandom, 9999 + oliverintfinal, 120000, true));
            DatabaseBonusPostgre.addBonus(new Bonus(DatabaseBonusPostgre.getLastId() + 1, "hartono" + hartonorandom, 19999 + hartonointfinal, 400000, false));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
