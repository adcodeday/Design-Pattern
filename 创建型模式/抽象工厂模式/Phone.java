package 创建型模式.抽象工厂模式;

abstract public class Phone {
    protected String name;
    protected int price;

    private void setPrice(int price) {
        this.price = price;
    }

    private void setName(String name) {
        this.name = name;
    }
    public void set(int price,String name){
        setName(name);
        setPrice(price);
    }
}
