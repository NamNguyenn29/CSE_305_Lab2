package q1;

public interface Contract {

    public Contract BuildContactID(String contractID);

    public Contract BuildPropertyID(String propertyID);

    public Contract BuildTenantID(String tenantID);

    public Contract BuildRentAmount(double rentAmount);

    public Contract signContract();

}