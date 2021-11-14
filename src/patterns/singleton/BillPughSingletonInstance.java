package patterns.singleton;

public class BillPughSingletonInstance {
    private BillPughSingletonInstance(){}

    private static class SingletonHelper{
        private static final BillPughSingletonInstance INSTANCE = new BillPughSingletonInstance();
    }

    public static BillPughSingletonInstance getInstance(){
        return SingletonHelper.INSTANCE ;
    }
}
