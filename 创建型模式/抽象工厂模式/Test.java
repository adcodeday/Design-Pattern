package 创建型模式.抽象工厂模式;

public class Test {
    public static void main(String[] args) {
        Factory factory=new HuaweiFactory();
        Phone phone=factory.creatPhone();
        System.out.println(phone.name+phone.price);
        Computer computer= factory.creatConputer();
        System.out.println(computer.name+computer.price);
        factory=new AppleFactory();
        phone=factory.creatPhone();
        System.out.println(phone.name+phone.price);
        computer=factory.creatConputer();
        System.out.println(computer.name+computer.price);
    }
}
