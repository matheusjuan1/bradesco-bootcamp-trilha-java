package singleton;

/**
 * Singleton "apressado"
 * 
 * @author matheusjuan1
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
