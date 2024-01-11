package 创建型模式.抽象工厂模式;

public class AppleFactory implements Factory<ApplePhone,AppleComputer>{
    @Override
    public ApplePhone creatPhone() {
        return new ApplePhone();
    }

    @Override
    public AppleComputer creatConputer() {
        return new AppleComputer();
    }
}
