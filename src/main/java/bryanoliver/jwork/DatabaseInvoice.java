package bryanoliver.jwork;
import java.util.ArrayList;

/**
   * Class Database Invoice
   *
   * @author Bryan Oliver
   * @version 10.6.2021
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

    /**
     * getter for invoice by id
     * @param id
     * @return
     * @throws InvoiceNotFoundException
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        Invoice x = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                x = invoice;
                return x;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    /**
     * getter invoice by jobseeker
     * @param jobseekerid
     * @return
     */
    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerid){
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (Invoice invoice : INVOICE_DATABASE) {
            if (jobseekerid == invoice.getJobseeker().getId()) {
                temp.add(invoice);
            } else {
                return null;
            }
        }
        return temp;
    }

    /**
     * add invoice function
     * @param invoice
     * @return
     * @throws OnGoingInvoiceAlreadyExistException
     */
    public static boolean addInvoice(Invoice invoice) throws OnGoingInvoiceAlreadyExistException{
        for (Invoice invoicee : INVOICE_DATABASE) {
            if (invoicee.getInvoiceStatus() == InvoiceStatus.OnGoing | invoicee.getId() == invoice.getId()) {
                throw new OnGoingInvoiceAlreadyExistException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    /**
     * change invoice status function
     * @param id
     * @param invoiceStatus
     * @return
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    /**
     * Removing Invoice by Id
     * @param id
     * @return
     * @throws InvoiceNotFoundException
     */
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException{
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}