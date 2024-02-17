package 创建型模式.建造者模式.建造包;

import 创建型模式.建造者模式.原料类.Drink;
import 创建型模式.建造者模式.原料类.Hamburg;

public interface IMeun {
    Meun addHamburg(Hamburg hamburg);
    Meun addDrink(Drink drink);
}
