package 行为型模式.策略模式;

public class PriceCulculator {
    Strategy strategy;
    PriceCulculator(Strategy strategy){this.strategy=strategy;}

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public double cul(){
        return strategy.cal();
    }
}
