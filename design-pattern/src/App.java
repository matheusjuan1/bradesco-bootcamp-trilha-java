import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.IComportamento;
import strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy

        IComportamento normal = new ComportamentoNormal();
        IComportamento defensivo = new ComportamentoDefensivo();
        IComportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
