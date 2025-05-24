package q2;

public class Confidential implements Document {
    private String extenstion;
    private String encryption;

    public Confidential() {
    }

    public Confidential(String extenstion, String encryption) {
        this.extenstion = extenstion;
        this.encryption = encryption;
    }

    @Override
    public Document setExtension() {
        this.extenstion = ".zip";
        return this;
    }

    @Override
    public Document setEncryption() {
        this.encryption = "none";
        return this;
    }

    @Override
    public Document build() {
        return new NormalDoc(this.extenstion, this.encryption);
    }

    @Override
    public String toString() {
        return "Confidential [extenstion=" + extenstion + ", encryption=" + encryption + "]";
    }

}