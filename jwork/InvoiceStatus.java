/**
 * Enum InvoiceStatus
 *
 * @author Bryan Oliver
 * @version 27.3.2021
 */
public enum InvoiceStatus {
    OnGoing("On Going"),
    Finished("Finished"),
    Cancelled("Cancelled");
    
    
    private String status;
    private InvoiceStatus(String status) {
        this.status = status;
    }
    public String toString(){
        return this.status;
    }
}

