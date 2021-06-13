package bryanoliver.jwork;

/**
 * Exception Class JobSeekerNotFoundException
 *
 * @author Bryan Oliver
 * @version 10.6.2021
 */
public class JobSeekerNotFoundException extends Exception {
    private int jobseeker_error;

    /**
     * JobSeekerNotFoundException
     * @param jobseeker_input
     */
    public JobSeekerNotFoundException(int jobseeker_input) {
        super("Jobseeker Id: ");
        this.jobseeker_error = jobseeker_input;
    }

    /**
     * get message for jobseeker_error
     * @return
     */
    public String getMessage() {
        return super.getMessage() + jobseeker_error + " not found";
    }

}