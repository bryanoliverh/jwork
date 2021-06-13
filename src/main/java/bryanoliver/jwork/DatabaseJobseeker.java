package bryanoliver.jwork;
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

    /**
     * Add jobseeker
     * @param jobseeker
     * @return
     * @throws EmailAlreadyExistsException
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker element : JOBSEEKER_DATABASE) {
            if (element.getEmail() == jobseeker.getEmail()) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    /**
     * Remove jobseeker
     * @param id
     * @return
     * @throws JobSeekerNotFoundException
     */

    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                JOBSEEKER_DATABASE.remove(jobseeker.getId());
                return true;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    /**
     * get jobseeker by id
     * @param id
     * @return
     * @throws JobSeekerNotFoundException
     */
    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException{
        Jobseeker a = null;
        try{
            for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
                if (id == jobseeker.getId()) {
                    a = jobseeker;
                }
            }
        }
        catch (Exception e){
            throw new JobSeekerNotFoundException(id);
        }
        return a;
    }

    /**
     * get jobseeeker login
     * @param email
     * @param password
     * @return
     */
    public static Jobseeker getJobseekerLogin(String email, String password){
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                return jobseeker;
            }
        }
        return null;
    }



}
