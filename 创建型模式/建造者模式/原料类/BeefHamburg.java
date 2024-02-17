package 创建型模式.建造者模式.原料类;

public class BeefHamburg extends Hamburg{
    @Override
    public String name() {
        return "牛肉汉堡";
    }

    @Override
    public int price() {
        return 20;
    }
}
