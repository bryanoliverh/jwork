package bryanoliver.jwork;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        SpringApplication.run(JWork.class, args);
        Location location1 = new Location("California", "LA", "Lakers");
        Location locationnew = new Location("Texas", "Phoenix", "Suns");
        Location location3 = new Location("New York", "Manhattan", "MSG");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Bryan", "bryan.oliver@ui.ac.id", "0821212193", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Oliver", "ilhan.rafid@ui.ac.id", "081234567890", locationnew));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Hartono", "oliver.hartono@ui.ac.id", "01233456", location3));
        try {
            DatabaseJob.addJob(new Job(1, "Database Engineer", DatabaseRecruiter.getRecruiterById(1), 100000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "GCP Analyst", DatabaseRecruiter.getRecruiterById(2), 200000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(3, "UI UX", DatabaseRecruiter.getRecruiterById(3), 300000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(4, "Business Intelligence", DatabaseRecruiter.getRecruiterById(3), 400000, JobCategory.DataAnalyst));
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
//        EwalletPayment invoicefirst = new EwalletPayment(1, newJob1, newjobseeker, InvoiceStatus.Finished);
//        EwalletPayment invoicesec = new EwalletPayment(2, newJob2, newjobseekersec, bonusnew, InvoiceStatus.Finished);
//        EwalletPayment invoicethir = new EwalletPayment(3, newJob3,  newjobseekerthir, bonusnew, InvoiceStatus.Finished);
//        BankPayment banker1 = new BankPayment(4, newJob4, newjobseeker, InvoiceStatus.Finished);
//        BankPayment banker2 = new BankPayment(5, newJob2, newjobseeker, InvoiceStatus.Finished, 10000);
//


//        SpringApplication.run(JWork.class, args);
    }
}