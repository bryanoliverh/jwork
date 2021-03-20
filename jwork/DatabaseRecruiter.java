/**
 * Class DatabaseRecruiter
 *
 * @author Bryan Oliver
 * @version 20.3.2021
 */
//class DatabaseJob
public class DatabaseRecruiter
{
    private String[] listRecruiter;
    /**
 * public DatabaseRecruiter()
 * membuat fungsi DatabaseRecruiter dengan mode public (isi dikosongkan)
 */
    public DatabaseRecruiter()
    {
        
    }

   /**
 * public DatabaseRecruiter()
 * @param listJob berisi objek listJob
 */
    public DatabaseRecruiter(String[] listRecruiter){
        this.listRecruiter = listRecruiter;
    }
/**
 * public addRecruiter()
 * @param recruiter berisi objek recruiter
 * @return false (secara sementara untuk boolean)
 */
    public boolean addRecruiter(Recruiter recruiter){
        return false;
    }
    
    /**
 * public removeRecruiter()
 * @param recruiter berisi objek recruiter
 * @return false (secara sementara untuk boolean)
 */
    public boolean removeRecruiter(Recruiter recruiter){
        return false;
    }
/**
 * public getRecruiter()
 * @return null (secara sementara untuk boolean)
 */
    public Recruiter getRecruiter(){
        return null;
    }
    
    /**
 * public getListRecruiter()
 * @return listRecruiter sesuai array objek listRecruiter
 */
    public String[] getListRecruiter(){
        return listRecruiter;
    }
}
