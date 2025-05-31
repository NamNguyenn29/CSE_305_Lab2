public abstract class RequestProduct {

    protected String priority;
    protected String expireDay;
    protected String status;

    public abstract void setPriority(String priority);

    public abstract void setExpireDay(String expireDay);

    public abstract void setStatus(String status);

    public void processReques() {
    }

    public RequestProduct() {
    };

    

}