package 结构型模式.组合模式;

public class Squre implements Shape{
    private double side;
    Squre(double side){this.side=side;}
    @Override
    public double getArea() {
        return side*side;
    }
}
