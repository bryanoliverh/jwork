package bryanoliver.jwork;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        SpringApplication.run(JWork.class, args);

        Location locationnew1 = new Location("South California", "Los Angeles", "Oracle Arena");
        Location locationnew2 = new Location("Texas", "Phoenix", "Suns Arena");
        Location locationnew3 = new Location("Californa", "San Fransisco", "Bay Area");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Bryan", "bryan.oliver@ui.ac.id", "12345677", locationnew1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Oliver", "bryan.oliver@ui.ac.id", "12345677", locationnew2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Hartono", "bryan.oliver@ui.ac.id", "12345677", locationnew3));


        ArrayList<Job> newJob1 = new ArrayList<Job>();
        ArrayList<Job> newJob2 = new ArrayList<Job>();
        ArrayList<Job> newJob3 = new ArrayList<Job>();
        ArrayList<Job> newJob4 = new ArrayList<Job>();

        try {
            DatabaseJob.addJob(new Job(1, "Backend GCP", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "Backend Engineer Database", DatabaseRecruiter.getRecruiterById(2), 20000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(3, "UI", DatabaseRecruiter.getRecruiterById(3), 30000, JobCategory.DataScientist));
            DatabaseJob.addJob(new Job(4, "Data Analyst Intern", DatabaseRecruiter.getRecruiterById(3), 40000, JobCategory.DataAnalyst));

        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }

        SpringApplication.run(JWork.class, args);
    }
}