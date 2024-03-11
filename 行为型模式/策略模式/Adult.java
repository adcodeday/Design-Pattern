package 行为型模式.策略模式;

public class Adult implements Strategy{
    @Override
    public double cal() {
        return 100;
    }
}
