package 结构型模式.享元模式;

public class KeBianFactory {
    private XiangYuanFactory xiangYuanFactory=new XiangYuanFactory();

    private XiangYuan getXiangYuan(String username){
        return xiangYuanFactory.getXiangYaun(username);
    }
    public KeBian creatKeBian(String message,String username){
        return new KeBian(getXiangYuan(username),message);
    }
}
