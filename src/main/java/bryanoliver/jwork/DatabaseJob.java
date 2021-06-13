package bryanoliver.jwork;
import java.util.ArrayList;
/**
 * Class Database Job
 *
 * @author Bryan Oliver
 * @version 10.6.2021
 */

public class DatabaseJob {
    // instance variable dari DatabaseJob
    private static ArrayList<Job> JOB_DATABASE =  new ArrayList<Job>();
    private static int lastId = 0;


    /**
     * getter for job database
     * @return
     */

    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    /**
     * Getter for last id
     * @return
     */
    public static int getLastId(){
        return lastId;
    }


    /**
     * getter for job by id
     * @param id
     * @return
     * @throws JobNotFoundException
     */
    public static Job getJobById(int id) throws JobNotFoundException {
        Job temp = null;
        for (Job element : JOB_DATABASE) {
            if (element.getId() == id) {
                temp = element;
                return temp;
            }
        }
        throw new JobNotFoundException(id);
    }

//    public static Job getJobById(int id) throws JobNotFoundException {
//        Job x = null;
//        try{for (Job job : JOB_DATABASE) {
//            if (id == job.getId()) {
//                x = job;
//            }
//        }}
//        catch (Exception e){
//            throw new JobNotFoundException(id);}
//        return x;
//    }
    /**
     * get Job by Recruiter
     * @param recruiterId
     * @return
     */
    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
        ArrayList<Job> result = null;

        for (Job element : JOB_DATABASE) {
            if (element.getRecruiter().getId() == recruiterId) {
                if (result == null) {
                    result = new ArrayList<Job>();
                }
                result.add(element);
            }
        }
        return result;
    }

    /**
     * add job function
     * @param job
     * @return
     */
    public static boolean addJob(Job job) {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    /**
     * Remove Job function
     * @param id
     * @return
     * @throws JobNotFoundException
     */
    public static boolean removeJob(int id) throws JobNotFoundException {
        boolean temp = false;
        for (Job element : JOB_DATABASE) {
            if (element.getId() == id) {
                JOB_DATABASE.remove(element);
                temp = true;
                break;
            }
        }
        if (!temp){
            throw new JobNotFoundException(id);
        }
        return temp;
    }




    /**
     * get Job by category
     * @param category
     * @return
     */
    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }

}