package bryanoliver.jwork;
/**
 * Class Fee Calculator
 *
 * @author Bryan Oliver
 * @version 10.6.2021
 */

public class FeeCalculator implements Runnable{
    private Invoice invoice;

    /**
     * Fee Calculator Constructor
     * @param invoice
     */
    public FeeCalculator (Invoice invoice){
        this.invoice = invoice;
    }

    /**
     * Run function
     */
    @Override
    public void run(){
        System.out.println("Calculate invoice id: " + invoice.getId());
        invoice.setTotalFee();
        System.out.println("Done processing invoice id: " + invoice.getId());
    }
}
