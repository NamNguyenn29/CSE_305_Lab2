public class LowPriorityRequestCreator implements RequestCreator {

    @Override
    public RequestProduct createRequest() {
        return new LowPriorityConcrete();
    }


}
