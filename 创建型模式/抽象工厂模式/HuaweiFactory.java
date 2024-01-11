package 创建型模式.抽象工厂模式;

public class HuaweiFactory implements Factory<HuaweiPhone,HuaweiComputer>{

    @Override
    public HuaweiPhone creatPhone() {
        return new HuaweiPhone();
    }

    @Override
    public HuaweiComputer creatConputer() {
        return new HuaweiComputer();
    }
}
