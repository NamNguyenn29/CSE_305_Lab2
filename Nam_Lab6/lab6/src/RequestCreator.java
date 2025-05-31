public interface RequestCreator {
    public RequestProduct createRequest();

    public default void proceedRequest() {
        createRequest().processReques();
    }

}
