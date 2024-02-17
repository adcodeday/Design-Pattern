package 结构型模式.享元模式;

public class XiangYuan {
    private String username;
    private String password;
    XiangYuan(String username,String password){
        this.password=password;
        this.username=username;
    }
    public String getUsername() {
        return username;
    }
}
