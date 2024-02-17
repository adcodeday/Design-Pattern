package 结构型模式.享元模式;
import java.util.HashMap;
import java.util.Scanner;
public class XiangYuanFactory {
    HashMap<String,XiangYuan> XiangYuans=new HashMap<>();
    public XiangYuan getXiangYaun(String username){
        XiangYuan xiangYuan=XiangYuans.get(username);
        if(xiangYuan==null){
            System.out.println("用户不存在");
            xiangYuan=creatXiangYuan(username);
            XiangYuans.put(username,xiangYuan);
        }
        return xiangYuan;
    }
    private XiangYuan creatXiangYuan(String username){
        System.out.println("请输入密码");
        Scanner input=new Scanner(System.in);
        String password=new String(input.next());
        return new XiangYuan(username,password);
    }
}
