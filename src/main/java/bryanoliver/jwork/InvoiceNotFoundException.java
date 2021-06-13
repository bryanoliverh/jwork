package bryanoliver.jwork;
/**
 * Exception class InvoiceNotFoundException
 *
 * @author Bryan Oliver
 * @version 7.6.2021
 */

public class InvoiceNotFoundException extends Exception {
    private int invoice_error;

    /**
     * Exception for invoice not found
     * @param invoice_input
     */
    public InvoiceNotFoundException(int invoice_input){
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }

    /**
     * get message function for invoice error
     * @return
     */
    public String getMessage() {
        return super.getMessage() + invoice_error + " not found";
    }

}