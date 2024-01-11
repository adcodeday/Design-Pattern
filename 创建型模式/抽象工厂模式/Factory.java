package 创建型模式.抽象工厂模式;

public interface Factory<Ph extends Phone,Co extends Computer> {
    Ph creatPhone();
    Co creatConputer();
}
