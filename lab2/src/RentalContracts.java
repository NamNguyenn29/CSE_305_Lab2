public class RentalContracts {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;
    public RentalContracts(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public void terminateContract() {
        
    }
}
