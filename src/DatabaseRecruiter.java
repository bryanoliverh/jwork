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
 * @param recruiter berisi objek recruiter
 * @return false (secara sementara untuk boolean)
 */
    public static boolean removeRecruiter(int id)
    {
        boolean tempBool = true;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()){
                RECRUITER_DATABASE.remove(id);
                tempBool = true;
            }
            else{
                tempBool = false;
            }
        }
        return tempBool;
    }
/**
 * public getRecruiterById()
 * @return bergantung hasil for
 */

public static Recruiter getRecruiterById(int id)
{
    Recruiter tempVar = null;
    for (Recruiter recruiter: RECRUITER_DATABASE) {
        if (id == recruiter.getId()){
            tempVar = recruiter;
        }
        else{
            tempVar =  null;
        }
    }
        return tempVar;
    }
}

