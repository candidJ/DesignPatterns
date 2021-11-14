package patterns.singleton;

public class EagerSingletonInstance {

    private static final EagerSingletonInstance instance = new EagerSingletonInstance();

    // private constructor to avoid client application to use constructor
    private EagerSingletonInstance(){}

    public static EagerSingletonInstance getInstance() {
        return instance;
    }
}
