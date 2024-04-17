package GOF.strategy;

public class Robo {

    private Comportamento strategy;

    public void setComportamento(Comportamento comportamento) {
        this.strategy = comportamento;
    }

    public void move() {
        strategy.move();
    }
}
