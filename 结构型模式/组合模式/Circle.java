package 结构型模式.组合模式;

public class Circle implements Shape{
    private double r;
    Circle(int r){this.r=r;}
    @Override
    public double getArea() {
        return r*3.14159;
    }
}
