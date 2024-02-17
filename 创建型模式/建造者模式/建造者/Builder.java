package 创建型模式.建造者模式.建造者;

import 创建型模式.建造者模式.原料类.BeefHamburg;
import 创建型模式.建造者模式.原料类.Cola;
import 创建型模式.建造者模式.原料类.Milk;
import 创建型模式.建造者模式.原料类.XianglaHamburg;
import 创建型模式.建造者模式.建造包.Meun;

public class Builder {
    public Meun getXiangla(){
        return new Meun("香辣套餐")
                .addHamburg(new XianglaHamburg())
                .addDrink(new Cola());
    }
    public Meun getNiurou(){
        return new Meun("牛肉套餐")
                .addHamburg(new BeefHamburg())
                .addDrink(new Milk());
    }
}
