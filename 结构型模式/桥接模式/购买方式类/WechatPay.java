package 结构型模式.桥接模式.购买方式类;

public class WechatPay implements Payment{
    @Override
    public void processPayment() {
        System.out.println("微信购买");
    }
}
