public class MediumPriorityConcrete extends RequestProduct {
    
    @Override
    public void processReques() {
        System.out.println(super.priority + " " + super.expireDay + " " + super.status);
        System.out.println("Request accept, estimated\r\n" + //
                "completion date is " + super.expireDay);
    }

    @Override
    public void setPriority(String priority) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPriority'");
    }

    @Override
    public void setExpireDay(String expireDay) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setExpireDay'");
    }

    @Override
    public void setStatus(String status) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStatus'");
    }
}