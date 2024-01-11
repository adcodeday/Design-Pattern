package 创建型模式.工厂方法模式.工厂方法模式;

public class HumburgFactory extends Factory {
    @Override
    public Goods getGoods() {
        return new Humburg();
    }
}
