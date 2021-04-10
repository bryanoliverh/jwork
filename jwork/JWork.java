import java.util.GregorianCalendar;

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
        Job jobnew2 = new Job(1, " Management ", recruiternew, 200000, JobCategory.FrontEnd);
        
        Jobseeker newjobseeker = new Jobseeker(99, "Bryan", "bryan.oliver@ui.ac.id", "sec123Ret1", new GregorianCalendar(2021,04,18));
        Jobseeker newjobseekersec = new Jobseeker(99, "Bryan", "bryanoliver@ui.ac.id", "10BrySno",  2021, 04, 18); 
        Jobseeker newjobseekerthir = new Jobseeker(99, "Bryan", "ol123iver@ui.ac.id", "123bRyan0"); 
        
        EwalletPayment invoicefirst = new EwalletPayment(1, jobnew, jobseeker1, InvoiceStatus.Finished);
        EwalletPayment invoicesec = new EwalletPayment(2, jobnew, jobseeker2, bonus1, InvoiceStatus.Finished);
        EwalletPayment invoicethir = new EwalletPayment(3, jobnew,  jobseeker3, bonus1, InvoiceStatus.Finished);
        BankPayment banker1 = new BankPayment(4, jobnew, jobseekernw, InvoiceStatus.Finished);
        BankPayment banker2 = new BankPayment(5, job2, jobseeker2, InvoiceStatus.Finished, 5000);

        invoicefirst.setTotalFee();
        invoicesec.setTotalFee();
        invoicethir.setTotalFee();
        banker1.setTotalFee();
        banker2.setTotalFee();
        
        System.out.println("\n==================== E-Wallet ====================");
        
        System.out.println(banker1);
        System.out.println("\n==================== Bank ====================");
        System.out.println(banker2);
        
        //System.out.println(newjobseeker.toString());
        //System.out.println(newjobseekersec.toString());
        //System.out.println(newjobseekerthir.toString());
        //BankPayment bank1 = new BankPayment(1, jobnew, "3/4/2020", newjobseeker, InvoiceStatus.Finished);

        //BankPayment bank2 = new BankPayment(2, jobnew, "3/4/2020", newjobseeker, InvoiceStatus.Finished, 10000);

        //bank1.printData();
        //bank2.printData();
       

      
    }
}
