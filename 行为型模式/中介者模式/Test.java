package 行为型模式.中介者模式;

public class Test {
    public static void main(String[] args) {
        Member m1=new Member("m1");
        Member m2=new Member("m2");
        ChatGroup chatGroup=new ChatGroup();
        m1.setChatGroup(chatGroup);
        m2.setChatGroup(chatGroup);
        m1.chatInGroup("你好");
    }
}
