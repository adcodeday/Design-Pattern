package 创建型模式.建造者模式.原料类;

public class Cola extends Drink{
    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public int price() {
        return 5;
    }
}
