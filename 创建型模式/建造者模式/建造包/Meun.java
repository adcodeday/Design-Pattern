package 创建型模式.建造者模式.建造包;

import 创建型模式.建造者模式.原料类.Drink;
import 创建型模式.建造者模式.原料类.Hamburg;
import 创建型模式.建造者模式.原料类.Matter;

import java.util.ArrayList;

public class Meun implements IMeun{
    ArrayList<Matter> matters=new ArrayList<Matter>();
    private String name;
    public Meun(String name){
        this.name=name;
    }
    @Override
    public Meun addHamburg(Hamburg hamburg) {
        matters.add(hamburg);
        return this;
    }

    @Override
    public Meun addDrink(Drink drink) {
        matters.add(drink);
        return this;
    }
}
