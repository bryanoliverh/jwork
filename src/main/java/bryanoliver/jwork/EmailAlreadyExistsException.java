package bryanoliver.jwork;
public class EmailAlreadyExistsException extends Exception {
    /**
     * Exception Class EmailAlreadyExistsException
     *
     * @author Bryan Oliver
     * @version 10.6.2021
     */

    private Jobseeker jobseeker_error;

    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        this.jobseeker_error = jobseeker_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + " already exists.";
    }
}