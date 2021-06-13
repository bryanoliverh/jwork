package bryanoliver.jwork;
/**
 * Exception Class OnGoingInvoiceAlreadyExistException
 *
 * @author Bryan Oliver
 * @version 10.6.2021
 */
public class OnGoingInvoiceAlreadyExistException extends Exception{
    private Invoice invoice_error;

    /**
     * OnGoingInvoiceAlreadyExistException
     * @param invoice_input
     */
    public OnGoingInvoiceAlreadyExistException(Invoice invoice_input)
    {
        super("Invoice Status: ");
        invoice_error = invoice_input;
    }

    /**
     * get message to accomodate invoice error
     * @return
     */
    public String getMessage()
    {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists.";
    }
}