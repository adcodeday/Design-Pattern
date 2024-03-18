package 行为型模式.中介者模式;

import java.util.ArrayList;

public class ChatGroup {
    private ArrayList<Member> mems=new ArrayList<>();
    public void sendMesaageToAllMembers(Member mem,String message){
        for(Member member:mems){
            member.acceptMe(mem.getName()+":"+message);
        }
    }
    public void addMem(Member member){
        mems.add(member);
    }
}
