package 结构型模式.享元模式;

public class KeBian {
    private XiangYuan xiangYuan;
    private String message;
    KeBian(XiangYuan xiangYuan,String message){
        this.xiangYuan=xiangYuan;
        this.message=message;
    }
    public void getInfo(){
        System.out.println("username:"+xiangYuan.getUsername());
        System.out.println("message:"+message);
    }
}
