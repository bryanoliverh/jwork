package bryanoliver.jwork;
/**
 * Exception Class RecruiterNotFoundException
 *
 * @author Bryan Oliver
 * @version 10.6.2021
 */
public class RecruiterNotFoundException extends Exception{
    private int recruiter_error;

    /**
     * RecruiterNotFoundException
     * @param recruiter_input
     */
    public RecruiterNotFoundException(int recruiter_input)
    {
        super("Recruiter Id: ");
        recruiter_error = recruiter_input;
    }

    /**
     * get message for recruiter error
     * @return
     */
  public String getMessage()
    {
        return super.getMessage() + recruiter_error + " Not Found";
    }
}