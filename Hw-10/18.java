class test {
    protected String owner;
    protected String id;
    public test(String own,String s) {
        owner=own;
        id=s;
    }
    final void show() {
        System.out.println("車主姓名:"+owner);
        System.out.println("車牌號碼:"+id);
    }
}
class test1 extends test {
    public String color;
    public test1(String own,String s,String col) {
        super(own,s);
        color=col;
    }
    
}

public class Nml {
    public static void main(String args[]) {
        test1 x=new test1("Riaan","A1-2345","Black");
        x.show();
        System.out.println("車身顏色:"+x.color);
    }
}
