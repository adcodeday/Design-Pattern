package 创建型模式.工厂方法模式.工厂方法模式;

public class Test {
    public static void main(String[] args) {
        Factory factory=new DrinkFactory();
        Goods goods=factory.getGoods();
        System.out.println(goods.price+","+goods.name);
    }
}
