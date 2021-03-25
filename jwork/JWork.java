/**
 * Class JWork
 *
 * @author Bryan Oliver
 * @version 25.3.2021
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
        Recruiter recruiternew = new Recruiter(1, " Bryan Oliver ", " bryanoliverh@gmail.com ", " 087878383294 ", locationnew);
        Job jobnew = new Job(1, " Management ", recruiternew, 200000, JobCategory.FrontEnd);
        jobnew.printData();
    }
}
