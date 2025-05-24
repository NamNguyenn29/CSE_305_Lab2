public class Client {

    public void requestCreateRentalContract(Contract builder) {
        builder.BuildContactID("1").BuildPropertyID("2").BuildTenantID("3").BuildRentAmount(123);
        Contract contract = builder.signContract();
        System.out.println(contract);
    }
}
