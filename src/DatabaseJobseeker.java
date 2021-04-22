import java.util.ArrayList;

/**
 * Class DatabaseJobseeker
 *
 * @author Bryan Oliver
 * @version 22.4.2021
 */
//class DatabaseJobseeker

public class DatabaseJobseeker {
/**
* Inisiasi Variabel
 */
private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;
    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }
    public static boolean addJobseeker(Jobseeker jobseeker) {
        boolean result = false;
        if (JOBSEEKER_DATABASE.size() == 0){
            JOBSEEKER_DATABASE.add(jobseeker);
            lastId = jobseeker.getId();
            result = true;
            return result;
        }
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (jobseeker.getEmail().equals(JOBSEEKER_DATABASE.get(i).getEmail())) {
                System.out.println("Email has been registered");
                result = false;
                return result;
            } else {
                JOBSEEKER_DATABASE.add(jobseeker);
                lastId = jobseeker.getId();
                result = true;
                return result;
            }

        }
        return result;
    }
    public static boolean removeJobseeker(int id) {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == jobseeker.getId()) {
                JOBSEEKER_DATABASE.remove(jobseeker);
                return true;
            }
        }
        return false;
    }
    public static Jobseeker getJobseekerById(int id) {
        Jobseeker temp = null;
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (id == JOBSEEKER_DATABASE.get(i).getId()) {
                temp = JOBSEEKER_DATABASE.get(i);
            }
        }
        return temp;
    }



}
