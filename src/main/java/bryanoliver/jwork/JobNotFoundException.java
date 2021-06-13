package bryanoliver.jwork;
/**
 * Exception Class JobNotFoundException
 *
 * @author Bryan Oliver
 * @version 10.6.2021
 */

public class JobNotFoundException extends Exception{

    private int job_error;

    /**
     * JobNotFoundException
     * @param job_input
     */
    public JobNotFoundException(int job_input){
        super("Job ID: ");
        job_error = job_input;
    }

    /**
     * get message for job error
     * @return
     */
    public String getMessage(){
        return super.getMessage() + job_error + " not found";
    }
}