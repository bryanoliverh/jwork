import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Class JWork
 *
 * @author Bryan Oliver
 * @version 22.4.2021
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
     */
    public static void main(String[] args)
    {
        Location locationnew = new Location("South California", "Los Angeles", "Oracle Arena");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Bryan", "BryanOliver@gmail.com", "12345677", locationnew));
//jobseeker
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker (DatabaseJobseeker.getLastId()+1, "Bryan", "bryan.oliver@ui.ac.id", "sec123Ret1", 2020, 9, 24));
        }
        catch (EmailAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker (DatabaseJobseeker.getLastId()+1, "Bryan", "bryan.oliver@ui.ac.id", "sec123Ret1", 2020, 9, 24));
        }
        catch (EmailAlreadyExistsException e){
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker (DatabaseJobseeker.getLastId()+1, "Ilham", "ilham@ui.ac.id", "sec123Ret1", 2020, 9, 24));
        }
        catch (EmailAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker (DatabaseJobseeker.getLastId()+1, "Rafid", "rafid@ui.ac.id", "sec123Ret1", 2020, 9, 24));
        }
        catch (EmailAlreadyExistsException e){
            System.out.println(e.getMessage());
        }

//Bonus
        try {
            DatabaseBonus.addBonus(new Bonus(24, "bryankeren", 10000, 50000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(9, "oliverkeren", 20000, 100000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
//job
        ArrayList<Job> newJob = new ArrayList<Job>();
        ArrayList<Job> newJob1 = new ArrayList<Job>();

        try {
            newJob.add(new Job(10, "Backend", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        try {
            newJob1.add(new Job(11, "Backend", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(10, newJob, DatabaseJobseeker.getJobseekerById(1)));
        } catch (JobSeekerNotFoundException e) {
            e.printStackTrace();
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(11, newJob1, DatabaseJobseeker.getJobseekerById(2)));
        } catch (JobSeekerNotFoundException e) {
            e.printStackTrace();
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(12, newJob1, DatabaseJobseeker.getJobseekerById(2)));
        } catch (JobSeekerNotFoundException e) {
            e.printStackTrace();
        }
        //error exception
        try {
            DatabaseJobseeker.removeJobseeker(10);
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseRecruiter.removeRecruiter(10);
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJob.getJobById(10);
        } catch (JobNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.getBonusById(10);
        } catch (BonusNotFoundException bonusNotFound) {
            System.out.println(bonusNotFound.getMessage());
        }
//thread
        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            new Thread(new FeeCalculator(invoice)).start();
        }


        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
        System.out.println("\n=====================Bonus Database====================\n");
        System.out.println(DatabaseBonus.getBonusDatabase());


//Location locationnew = new Location("South California", "Los Angeles", "Oracle Arena");
//        DatabaseBonus.addBonus(new Bonus(1,"BryanKeren", 10000, 100000,false));
//        DatabaseBonus.addBonus(new Bonus(1,"BryanKeren", 20000, 200000,true));
//        System.out.println(DatabaseBonus.getBonusDatabase());
       //        Jobseeker jobseeker1 = new Jobseeker(1, "Bryan", "bryan.oliver@ui.ac.id", "sec123Ret1");
//        DatabaseInvoice.addInvoice(new BankPayment(9, fjob, jobseeker1));
//
//
//        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, " Bryan ", " bryanoliverh@gmail.com ", " 012321232123 ", locationnew));
//        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Bryan", "bryan.oliver@ui.ac.id", "sec123Ret1", 2021, 04, 22));
//        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Bryan", "bryan.oliver@ui.ac.id", "sec123Ret1", 2021, 04 ,22));
//        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() +  1, "Ilham", "Ilham@ui.ac.id", "sec123Ret1", 2021, 04, 22));
//        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
//        DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "Database Admin", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.FrontEnd));
//        DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "Database Admin", DatabaseRecruiter.getRecruiterById(1), 20000, JobCategory.FrontEnd));
//        DatabaseJob.addJob(new Job(DatabaseJob.getLastId() + 1, "UI.UX", DatabaseRecruiter.getRecruiterById(1), 15000, JobCategory.Devops));
//        System.out.println(DatabaseJob.getJobByCategory(JobCategory.FrontEnd));
//        System.out.println(DatabaseJob.getJobByCategory(JobCategory.FrontEnd));
//////////////////////////////////////////////////////////////////////////////////////
//        System.out.println(DatabaseJobseeker.getJobseekerById(1));
//        System.out.println();
//        System.out.println(DatabaseJobseeker.getJobseekerById(2));
//        System.out.println();
//        System.out.println(DatabaseJobseeker.getJobseekerById(3));
//
//        System.out.println(DatabaseJob.getJobById(1));
//        System.out.println();
//        System.out.println(DatabaseJob.getJobById(2));
//        System.out.println();
//        System.out.println(DatabaseJob.getJobById(3));
//        Location locationnew = new Location("South California", "Los Angeles", "Oracle Arena");
//        Recruiter recruiternew = new Recruiter(1, " Bryan Oliver ", " bryanoliverh@gmail.com ", " 012321232123 ", locationnew);
//        Job jobnew = new Job(1, " Management ", recruiternew, 100000, JobCategory.FrontEnd);


        
//        Jobseeker newjobseeker = new Jobseeker(99, "Bryan", "bryan.oliver@ui.ac.id", "sec123Ret1", new GregorianCalendar(2021,04,18));
//        Jobseeker newjobseekersec = new Jobseeker(99, "Bryan", "bryanoliver@ui.ac.id", "10BrySno",  2021, 04, 18);
//        Jobseeker newjobseekerthir = new Jobseeker(99, "Bryan", "ol123iver@ui.ac.id", "123bRyan0");
//         Bonus bonusnew = new Bonus(1, "bonusBryanKeren", 100000, 1000000, true);
//        EwalletPayment invoicefirst = new EwalletPayment(1, jobnew, newjobseeker, InvoiceStatus.Finished);
//        EwalletPayment invoicesec = new EwalletPayment(2, jobnew, newjobseekersec, bonusnew, InvoiceStatus.Finished);
//        EwalletPayment invoicethir = new EwalletPayment(3, jobnew,  newjobseekerthir, bonusnew, InvoiceStatus.Finished);
//        BankPayment banker1 = new BankPayment(4, jobnew, newjobseeker, InvoiceStatus.Finished);
//        BankPayment banker2 = new BankPayment(5, jobnew, newjobseeker, InvoiceStatus.Finished, 10000);
//
//        invoicefirst.setTotalFee();
//        invoicesec.setTotalFee();
//        invoicethir.setTotalFee();
//        banker1.setTotalFee();
//        banker2.setTotalFee();
//
//        System.out.println("\n==================== E-Wallet ====================");
//
//        System.out.println(banker1);
//        System.out.println("\n==================== Bank ====================");
//        System.out.println(banker2);
//
        //System.out.println(newjobseeker.toString());
        //System.out.println(newjobseekersec.toString());
        //System.out.println(newjobseekerthir.toString());
        //BankPayment bank1 = new BankPayment(1, jobnew, "3/4/2020", newjobseeker, InvoiceStatus.Finished);

        //BankPayment bank2 = new BankPayment(2, jobnew, "3/4/2020", newjobseeker, InvoiceStatus.Finished, 10000);

        //bank1.printData();
        //bank2.printData();
       

      
    }
}
