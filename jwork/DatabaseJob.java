/**
 * Class DatabaseJob
 *
 * @author Bryan Oliver
 * @version 18.3.2021
 */
//class DatabaseJob
public class DatabaseJob {
    private String[] listJob;
/**
 * public DatabaseJob()
 * membuat listjob dengan array size 50
 */
    public DatabaseJob(){
       listJob = new String[50];
    }
/**
 * public DatabaseJob()
 * @param listJob berisi objek listJob
 */
    public DatabaseJob(String[] listJob){
        this.listJob = listJob;
    }
/**
 * public addJob()
 * @param job berisi objek job
 * @return false (secara sementara untuk boolean)
 */
    public boolean addJob(Job job){
        return false;
    }
/**
 * public removeJob()
 * @param job berisi objek job
 * @return false (secara sementara untuk boolean)
 */
    public boolean removeJob(Job job){
        return false;
    }
/**
 * public getJob()
 * @return null (secara sementara untuk boolean)
 */
    public Job getJob(){
        return null;
    }
/**
 * public getListJob()
 * @return listjob sesuai array objek listjob
 */
    public String[] getListJob(){
        return listJob;
    }
}
