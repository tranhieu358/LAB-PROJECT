package buoi4;

public class Member {
    private String name;
    private String phone;

    public Member(String _name, String _phone){
        this.name= _name;
        this.phone= _phone;
    }
    public String toString() {
        return " Hội viên:" + name + "SDT:" + phone;
    }
    
}
