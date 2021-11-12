package patterns.singleton;

public class StaticBlockSingletonInstance {
    private static StaticBlockSingletonInstance instance;

    static{
        try {
            instance = new StaticBlockSingletonInstance();
        }catch (Exception error){
            throw error;
        }
    }

    public static StaticBlockSingletonInstance getInstance(){
        return instance;
    }

}
