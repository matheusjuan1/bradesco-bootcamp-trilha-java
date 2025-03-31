package singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @see <a href="htpps://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author matheusjuan1
 */
public class SingletonLazyHolder {
    
    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
