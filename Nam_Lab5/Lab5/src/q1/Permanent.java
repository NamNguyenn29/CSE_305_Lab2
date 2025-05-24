package q1;
public class Permanent implements Contract {
    private String contractID;
    private double rentAmount;
    private String tenantID;
    private String propertyID;

    @Override
    public Contract BuildContactID(String contractID) {
        this.contractID = contractID;
        return this;
    }

    @Override
    public Contract BuildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    @Override
    public Contract BuildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    @Override
    public Contract BuildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public Contract signContract() {
        return this;
    }

    @Override
    public String toString() {
        return "Permanent [contractID=" + contractID + ", rentAmount=" + rentAmount + ", tenantID=" + tenantID
                + ", propertyID=" + propertyID + "]";
    }
    

}
