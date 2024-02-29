package 结构型模式.桥接模式.产品类;

import 结构型模式.桥接模式.购买方式类.Payment;

abstract public class Production {
    Production(Payment p){
        this.payment=p;
    }
    private Payment payment;
    protected String name;
    public void Buy(){
        payment.processPayment();
        System.out.println("******"+name+"******");
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
