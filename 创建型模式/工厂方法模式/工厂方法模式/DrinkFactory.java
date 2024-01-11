package 创建型模式.工厂方法模式.工厂方法模式;

public class DrinkFactory extends Factory{
    @Override
    public Goods getGoods() {
        return new Drink();
    }
}
