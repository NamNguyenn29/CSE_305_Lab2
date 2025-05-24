public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        client.requestCreateRentalContract(new LongTerm());
    }
}
