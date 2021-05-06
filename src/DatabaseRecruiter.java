import java.util.ArrayList;

/**
 * Class DatabaseRecruiter
 *
 * @author Bryan Oliver
 * @version 25.3.2021
 */
//class DatabaseJob
public class DatabaseRecruiter
{
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase()
    {
        return RECRUITER_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }

    /**
 * public addRecruiter()
 * @param recruiter berisi objek recruiter
 * @return true
 */
    public static boolean addRecruiter(Recruiter recruiter)
    {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }
    /**
 * public removeRecruiter()
 * @param id berisi id recruiter
 * @return false (secara sementara untuk boolean)
 */
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        boolean status = true;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                RECRUITER_DATABASE.remove(id);
                status = true;
                return status;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
/**
 * public getRecruiterById()
 * @return bergantung hasil for
 */
public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
    Recruiter status = null;
    for (Recruiter recruiter: RECRUITER_DATABASE) {
        if (id == recruiter.getId()) {
            status = recruiter;
            return status;
        }
    }
    throw new RecruiterNotFoundException(id);
}
}

