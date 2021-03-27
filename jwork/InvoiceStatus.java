/**
 * Enum InvoiceStatus
 *
 * @author Bryan Oliver
 * @version 27.3.2021
 */
public enum InvoiceStatus {
    OnGoing("On Going"),
    Finished("Finished");
    
    private String status;
    private InvoiceStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return this.status;
    }
}

