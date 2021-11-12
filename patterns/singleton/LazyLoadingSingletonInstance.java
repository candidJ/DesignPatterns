package patterns.singleton;

public class LazyLoadingSingletonInstance {
    private static LazyLoadingSingletonInstance instance;

    private LazyLoadingSingletonInstance(){}

    public static LazyLoadingSingletonInstance getInstance(){
        if(instance == null){
            return new LazyLoadingSingletonInstance();
        }
        return instance;
    }
}
