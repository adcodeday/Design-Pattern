package 结构型模式.桥接模式;

import 结构型模式.桥接模式.产品类.Book;
import 结构型模式.桥接模式.产品类.Food;
import 结构型模式.桥接模式.产品类.Production;
import 结构型模式.桥接模式.购买方式类.CreditCardPay;
import 结构型模式.桥接模式.购买方式类.Payment;
import 结构型模式.桥接模式.购买方式类.WechatPay;

public class Test {
    public static void main(String[] args) {
        Payment p=new WechatPay();
        Payment p1=new CreditCardPay();
        Production book=new Book(p);
        Production food=new Food(p1);
        book.Buy();
        food.Buy();
    }
}
