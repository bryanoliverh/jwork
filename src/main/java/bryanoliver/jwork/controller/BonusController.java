package bryanoliver.jwork.controller;

import bryanoliver.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Controller for Bonus
 *
 * @author Bryan Oliver
 * @version (8-6-2021)
 */
@RequestMapping("/bonus")
@RestController
public class BonusController {


    /**
     * request in order to return all bonuses
     * @return referralCode
     */
    @RequestMapping("")
    public ArrayList<Bonus> getAllBonus(){
        return(DatabaseBonusPostgre.getBonusDatabase());
    }
    @RequestMapping("/{referralCode}")
    public Bonus getBonusByReferralCode(
            @PathVariable String referralCode){
        return(DatabaseBonusPostgre.getBonusByRefferralCode(referralCode));
    }



    /**
     * request in order to add new bonus
     * @param referralCode
     * @param extraFee
     * @param minTotalFee
     * @param active
     * @return bonus
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(
            @RequestParam(value="referralCode") String referralCode,
            @RequestParam(value="extraFee") int extraFee,
            @RequestParam(value="minTotalFee") int minTotalFee,
            @RequestParam(value="active") boolean active

    ){
        Bonus bonus = new Bonus(DatabaseBonusPostgre.getLastId() + 1, referralCode, extraFee, minTotalFee, active);
        try{
            DatabaseBonusPostgre.addBonus(bonus);
        }
        catch (Exception e) {
            e.getMessage();
            return null;
        }
        return bonus;
    }

    /**
     * remove bonus
     * @param id
     * @return bonus
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeBonus(@RequestParam(value = "id") int id){
        Boolean bonus = DatabaseBonusPostgre.removeBonus(id);
        return bonus;
    }
}