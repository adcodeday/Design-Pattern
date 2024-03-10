package 结构型模式.组合模式;

import java.util.ArrayList;

public class ShapeContent implements Shape{
    ArrayList<Shape> co=new ArrayList<>();
    public void addco(Shape s){co.add(s);}
    @Override
    public double getArea() {
        double totalArea=0;
        for (Shape shape:co){
            totalArea=totalArea+shape.getArea();
        }
        return totalArea;
    }
}
