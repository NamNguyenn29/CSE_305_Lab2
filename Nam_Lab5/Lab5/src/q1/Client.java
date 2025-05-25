package q1;

import java.util.Scanner;

public class Client {

    public Contract requestCreateRentalContract(Contract builder) {
        builder.BuildContactID("1").BuildPropertyID("2").BuildTenantID("3").BuildRentAmount(123);
        Contract contract = builder.signContract();
        return contract;
    }

}
