import java.util.ArrayList;

/**
   * Class JWork
   *
   * @author Bryan Oliver
   * @version 22.4.2021
   */



public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }
    public static int getLastId(){
        return lastId;
    }
    public static Invoice getInvoiceById(int id){
        Invoice x = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                x = invoice;
            }
        }
        return x;
    }
    public static ArrayList<Invoice> getJobByJobseeker(int jobseekerid) {
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (jobseekerid == INVOICE_DATABASE.get(i).getJobseeker().getId()) {
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp;
    }
    public static boolean addInvoice(Invoice invoice)
    {
        for (Invoice invoicee : INVOICE_DATABASE) {
            if (invoicee.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId() && invoice.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }
    public static boolean removeInvoice(int id){
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        return false;
    }
}
