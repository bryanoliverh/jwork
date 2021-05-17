package bryanoliver.jwork;
public class FeeCalculator implements Runnable{
    private Invoice invoice;

    public FeeCalculator (Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void run(){
        System.out.println("Calculate invoice id: " + invoice.getId());
        invoice.setTotalFee();
        System.out.println("Done processing invoice id: " + invoice.getId());
    }
}
