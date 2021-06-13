package bryanoliver.jwork.controller;
import bryanoliver.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import static bryanoliver.jwork.DatabaseRecruiterPostgreLocid.getRecruiterById;


/**
 * Controller for Recruiter
 *
 * @author Bryan Oliver
 * @version (12-6-2021)
 */
@RequestMapping("/recruiter")
@RestController
public class RecruiterController {

    /**
     * return all recruiter in db
     * @return getRecruiterDatabase
     */

    @RequestMapping("")
    public ArrayList<Recruiter> getRecruiterDatabase()
    {
        return DatabaseRecruiter.getRecruiterDatabase();
    }

    /**
     * return a recruiter by its id in db
     * @return recruiter
     */

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Recruiter getRecruiterById(@PathVariable int id) throws RecruiterNotFoundException {
        Recruiter recruiter = DatabaseRecruiterPostgreLocid.getRecruiterById(id);
        return recruiter;
    }

//    @RequestMapping("/{id}")
//    public Recruiter getRecruiterById(@PathVariable int id) {
//        Recruiter recruiter = null;
//        try {
//            recruiter = DatabaseRecruiter.getRecruiterById(id);
//        } catch (RecruiterNotFoundException e) {
//            e.printStackTrace();
//        }
//        return recruiter;
//    }



    /**
     * add a new recruiter from db
     * @param name
     * @param email
     * @param phoneNumber
     * @param province
     * @param description
     * @param city
     * @return recruiter
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="phoneNumber") String phoneNumber,
                                  @RequestParam(value="province") String province,
                                  @RequestParam(value="description") String description,
                                  @RequestParam(value="city") String city) {
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber,  new Location(DatabaseLocationPostgre.getLastId()+1,city, province, description));
        DatabaseRecruiterPostgreLocid.addRecruiter(recruiter);
        return recruiter;
    }
}