package 创建型模式.工厂方法模式.简单工厂模式;

public class GoodsFactory {
    public Goods getGoods(){
        return new Goods();
    }
}
