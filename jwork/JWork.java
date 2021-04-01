/**
 * Class JWork
 *
 * @author Bryan Oliver
 * @version 01.4.2021
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
        
        Jobseeker newjobseeker = new Jobseeker(99, "bryan", "bryanoliverh@gmail.com", "secret", "27/3/2021");
        
        Bonus secondbon = new Bonus (1, "HEMATBRYANKEREN", 120000,100000, true);
        Bonus firstbon = new Bonus (2, "HEMATOliverKEREN", 100000,500000, true);
        
   
        EwalletPayment invoicenew1 = new EwalletPayment(1, jobnew, "1 April 2021", newjobseeker,InvoiceStatus.OnGoing);
        EwalletPayment invoicenew2 = new EwalletPayment(2, jobnew, "1 April 2021",newjobseeker,InvoiceStatus.OnGoing, firstbon);
        EwalletPayment invoicenew3 = new EwalletPayment(3, jobnew, "1 April 2021",newjobseeker,InvoiceStatus.Finished, secondbon);
        invoicenew1.printData();
        invoicenew2.printData();
        invoicenew3.printData();
    }
}
