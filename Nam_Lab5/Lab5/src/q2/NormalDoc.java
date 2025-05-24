package q2;

public class NormalDoc implements Document {
    private String extenstion;
    private String encryption;

    public NormalDoc(String extenstion, String encryption) {
        this.extenstion = extenstion;
        this.encryption = encryption;
    }

    public NormalDoc() {
    }

    @Override
    public Document setExtension() {
        this.extenstion = ".text";
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
        return "NormalDoc [extenstion=" + extenstion + ", encryption=" + encryption + "]";
    }

}
