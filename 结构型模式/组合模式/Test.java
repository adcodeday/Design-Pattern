package 结构型模式.组合模式;

public class Test {
    public static void main(String[] args) {
        Squre s1=new Squre(5);
        Squre s2=new Squre(8);
        Squre s3=new Squre(10);
        ShapeContent shapeContent1=new ShapeContent();
        ShapeContent shapeContent2=new ShapeContent();
        shapeContent1.addco(s1);
        shapeContent1.addco(s2);
        shapeContent2.addco(shapeContent1);
        shapeContent2.addco(s3);
        System.out.println(shapeContent2.getArea());
    }
}
