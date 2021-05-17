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

    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                JOBSEEKER_DATABASE.remove(jobseeker.getId());
                return true;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }


//    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
//        boolean result = false;
//        try{
//            if (JOBSEEKER_DATABASE.size() == 0){
//                JOBSEEKER_DATABASE.add(jobseeker);
//                lastId = jobseeker.getId();
//                result = true;
//                return result;
//            }
//            for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
//                if (jobseeker.getEmail().equals(JOBSEEKER_DATABASE.get(i).getEmail())) {
//                    System.out.println("Email Telah Diregistrasi");
//                    result = false;
//                } else {
//                    JOBSEEKER_DATABASE.add(jobseeker);
//                    lastId = jobseeker.getId();
//                    System.out.println("Jobseeker Ditambahkan");
//                    result = true;
//                }
//            }
//        } catch (Exception e){
//            if(result == false){
//                throw new EmailAlreadyExistsException(jobseeker);
//            }
//        }
//        return result;
//
//    }
//    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException{
//        try{
//            for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
//                if (jobseeker.getId() == jobseeker.getId()) {
//                    JOBSEEKER_DATABASE.remove(jobseeker);
//                    return true;
//                }
//            }
//        }
//        catch (Exception e){
//            throw new JobSeekerNotFoundException(id);
//        }
//        return false;
//    }
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



}
