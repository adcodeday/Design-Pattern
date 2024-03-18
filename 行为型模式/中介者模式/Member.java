package 行为型模式.中介者模式;

public class Member {
    private String name;
    private ChatGroup chatGroup;
    Member(String name){
        this.name=name;
    }
    public void chatInGroup(String message){
        chatGroup.sendMesaageToAllMembers(this,message);
    }
    public void acceptMe(String me){
        System.out.println(name+":Ac:"+me);
    }

    public String getName() {
        return name;
    }

    public void setChatGroup(ChatGroup chatGroup) {
        this.chatGroup = chatGroup;
        chatGroup.addMem(this);
    }
}
