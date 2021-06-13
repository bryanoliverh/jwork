package bryanoliver.jwork.controller;

import bryanoliver.jwork.*;
import org.springframework.web.bind.annotation.*;

import static bryanoliver.jwork.DatabaseJobseeker.getJobseekerLogin;
/**
 * Controller for Jobseeker
 *
 * @author Bryan Oliver
 * @version (8-6-2021)
 */


@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {


    /**
     * Print hello world
     * @param name
     * @return
     */
    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }



    /**
     * get a jobseeker by its id
     * @param id
     * @return jobseeker
     */
    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseekerPostgre.getJobseekerById(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    /**
     * register a new jobseeker to PostgreSQL
     * @param name
     * @param email
     * @param password
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value="name") String name,
                                       @RequestParam(value="email") String email,
                                       @RequestParam(value="password") String password) {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseekerPostgre.getLastId()+1, name, email, password);
        try {
            DatabaseJobseekerPostgre.addJobseeker(jobseeker);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }



    /**
     *  login by getting data from to PostgreSQL
     * @param email
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password){
        return(DatabaseJobseekerPostgre.getJobseekerLogin(email, password));
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeJobseeker(@RequestParam(value = "id") int id){
        Boolean jobseeker = DatabaseJobseekerPostgre.removeJobseeker(id);
        return jobseeker;
    }

}