package GOF.strategy;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void move() {
        System.out.println("está se movendo normalmente...");
    }
}
