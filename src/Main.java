import GOF.facade.Facade;
import GOF.singleton.SingletonEager;
import GOF.singleton.SingletonLazy;
import GOF.singleton.SingletonLazyHolder;
import GOF.strategy.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // Singleton lazy
//        SingletonLazy lazy = SingletonLazy.getInstance();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstance();
//        System.out.println(lazy);
//
//        // Singleton eager
//        SingletonEager eager = SingletonEager.getInstance();
//        System.out.println(eager);
//        eager = SingletonEager.getInstance();
//        System.out.println(eager);
//
//        // Singleton lazyholder
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
//        System.out.println(lazyHolder);
//        lazyHolder = SingletonLazyHolder.getInstance();
//        System.out.println(lazyHolder);

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.move();
        robo.setComportamento(agressivo);
        robo.move();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Enuch", "59123233");

    }
}