package GOF.singleton;

/***
 * Singleton "apressado"
 *
 * @author enuch
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}
