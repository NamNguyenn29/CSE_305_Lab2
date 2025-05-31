public class HighPriorityConcrete extends RequestProduct {
   

    @Override
    public void processReques() {
        System.out.println(super.priority + " " + super.expireDay + " " + super.status);
        System.out.println("Emergency request, our\r\n" + 
                "Administer will contact you immediately !");
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
