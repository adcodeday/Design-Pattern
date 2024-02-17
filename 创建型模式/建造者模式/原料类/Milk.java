package 创建型模式.建造者模式.原料类;

public class Milk extends Drink{

    @Override
    public String name() {
        return "牛奶";
    }

    @Override
    public int price() {
        return 15;
    }
}
