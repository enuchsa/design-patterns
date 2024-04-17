package GOF.strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void move() {
        System.out.println("está se movendo defensivamente...");
    }
}
