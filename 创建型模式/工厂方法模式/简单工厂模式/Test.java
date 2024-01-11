package 创建型模式.工厂方法模式.简单工厂模式;

public class Test {
    public static void main(String[] args) {
        GoodsFactory GF=new GoodsFactory();
        Goods goods= GF.getGoods();
        System.out.println(goods.getName()+goods.getPrice());
    }
}
