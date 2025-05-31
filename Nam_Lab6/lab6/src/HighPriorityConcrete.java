public class HighPriorityConcrete extends RequestProduct {

    public HighPriorityConcrete() {
        setPriority("Emergency");
        setExpireDay("30-6-2025");
        setStatus("Accept");

    }

    @Override
    public void processReques() {
        System.out.println(super.getPriority() + " " + super.getExpireDay() + " " + super.getStatus());
        System.out.println("Emergency request, our\r\n" +
                "Administer will contact you immediately !");
    }

}
