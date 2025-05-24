package q2;

public class Client {
    public Document createDocument(Document builder) {
        builder.setExtension().setEncryption();
        return builder.build();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Document confidential = client.createDocument(new Confidential());
        System.out.println(confidential);
    }
}

