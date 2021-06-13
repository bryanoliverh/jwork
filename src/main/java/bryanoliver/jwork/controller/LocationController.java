package bryanoliver.jwork.controller;

import bryanoliver.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Controller for Location
 *
 * @author Bryan Oliver
 * @version (12-6-2021)
 */
@RequestMapping("/location")
@RestController
public class LocationController {


    /**
     * request in order to return all location
     * @return location
     */
    @RequestMapping("")
    public ArrayList<Location> getAllLocation(){
        return(DatabaseLocationPostgre.getLocationDatabase());
    }


    /**
     * request in order to add new location
     * @param province
     * @param city
     * @param description
     * @return location
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Location addLocation(
            @RequestParam(value="province") String province,
            @RequestParam(value="city") String city,
            @RequestParam(value="description") String description

    ){
        Location location = new Location(DatabaseLocationPostgre.getLastId() + 1, province, city, description);
        try{
            DatabaseLocationPostgre.addLocation(location);
        }
        catch (Exception e) {
            e.getMessage();
            return null;
        }
        return location;
    }
}