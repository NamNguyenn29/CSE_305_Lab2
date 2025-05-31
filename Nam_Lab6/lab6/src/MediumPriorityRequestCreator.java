public class MediumPriorityRequestCreator implements RequestCreator {

    @Override
    public RequestProduct createRequest() {
        return new MediumPriorityConcrete();
    }

}
