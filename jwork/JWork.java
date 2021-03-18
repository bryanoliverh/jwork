
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class JWork
     */
    public JWork()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        Location locationnew = new Location("South California", "Los Angeles", "Oracle Arena");
        Recruiter recruiternew = new Recruiter(1, "Bryan Oliver", "bryanoliverh@gmail.com", "087878383294", locationnew);
        Job jobnew = new Job(1, "Bryan Oliver", recruiternew, 200000, "Tech Support");
        Jobseeker jobseekernew = new Jobseeker(1, "Oliver H", "bryanoliverh@ui.ac.id", "secretsecret", "18 Maret 2021");
        Invoice invoicenew = new Invoice(1, 1, "18 Maret 2021", 200000, jobseekernew);
    }
}
