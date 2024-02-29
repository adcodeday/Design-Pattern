package 结构型模式.桥接模式.产品类;

import 结构型模式.桥接模式.购买方式类.Payment;

public class Book extends Production{
    public Book(Payment p) {
        super(p);
        name="book";
    }

}
