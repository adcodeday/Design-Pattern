package 结构型模式.桥接模式.产品类;

import 结构型模式.桥接模式.购买方式类.Payment;

public class Food extends Production{
    public Food(Payment p) {
        super(p);
        name="Food";
    }
}
