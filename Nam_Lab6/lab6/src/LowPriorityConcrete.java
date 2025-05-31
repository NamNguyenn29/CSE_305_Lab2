public class LowPriorityConcrete extends RequestProduct {

    public LowPriorityConcrete() {
        setPriority("Ignore");
        setExpireDay("31-5-2025");
        setStatus("Done");
    }

    @Override
    public void processReques() {
        System.out.println(super.getPriority() + " " + super.getExpireDay() + " " + super.getStatus());
        System.out.println("Request Denied");
    }

}