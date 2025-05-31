public class App {
    public static void main(String[] args) throws Exception {
        RequestCreator requestCreator = new LowPriorityRequestCreator();
        requestCreator.proceedRequest();
    }
}
