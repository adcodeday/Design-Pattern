package 行为型模式.策略模式;

public class Test {
    public static void main(String[] args) {
        PriceCulculator priceCulculator=new PriceCulculator(new Child());
        System.out.println(priceCulculator.cul());
        priceCulculator.setStrategy(new Adult());
        System.out.println(priceCulculator.cul());
    }
}
