import java.util.ArrayList;

public class DatabaseJob {
    // instance variable dari DatabaseJob
    private static ArrayList<Job> JOB_DATABASE =  new ArrayList<Job>();
    private static int lastId = 0;
             public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    public static boolean remove(Job job){
        for (Job jobb : JOB_DATABASE) {
            if (job.getId() == jobb.getId()) {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        return false;
    }

    /**
     * fungsi untuk mengembalikan job
     *
     * @return    null
     */
    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Job getJobById(int id){
        Job x = null;
        for (Job job : JOB_DATABASE) {
            if (id == job.getId()) {
                x = job;
            }
        }
        return x;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> temp = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                temp.add(job);
            } else {
                return null;
            }
        }
        return temp;
    }

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