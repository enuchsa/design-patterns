package GOF.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void move() {
        System.out.println("está se movendo agressivamente...");
    }
}
