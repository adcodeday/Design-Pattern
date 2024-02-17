package 结构型模式.享元模式;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        KeBianFactory keBianFactory=new KeBianFactory();
        String username;
        String message;
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("输入用户名");
            username=input.next();
            System.out.println("输入消息");
            message=input.next();
            keBianFactory.creatKeBian(message,username).getInfo();
        }
    }
}
