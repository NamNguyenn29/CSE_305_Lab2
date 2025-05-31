public class LowPriorityConcrete extends RequestProduct {

    public LowPriorityConcrete() {
        setPriority("Ignore");
        setExpireDay("31-5-2025");
        setStatus("Done");
    }

    @Override
    public void processReques() {
        System.out.println(super.priority + " " + super.expireDay + " " + super.status);
        System.out.println("Request Denied");
    }

    @Override
    public void setPriority(String priority) {
        super.priority = priority;
    }

    @Override
    public void setExpireDay(String expireDay) {
        super.expireDay = expireDay;
    }

    @Override
    public void setStatus(String status) {
       super.status = status;
    }

}