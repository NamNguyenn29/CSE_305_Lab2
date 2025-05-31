public class HighPriorityRequestCreator implements RequestCreator {

    @Override
    public RequestProduct createRequest() {
        return new HighPriorityConcrete();
    }

}
