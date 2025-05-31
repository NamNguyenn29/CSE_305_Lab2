public class MediumPriorityConcrete extends RequestProduct {

    public MediumPriorityConcrete() {
        setPriority("Medium");
        setExpireDay("30-6-2025");
        setStatus("Accepted");
    }

    @Override
    public void processReques() {
        System.out.println(super.getPriority() + " " + super.getExpireDay() + " " + super.getStatus());
        System.out.println("Request accept, estimated\r\n" + //
                "completion date is " + super.getExpireDay());
    }

}