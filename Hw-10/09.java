class test {
    private int num;

    public void display() {
        System.out.println("printed from test2 class");
    }
}
class test1 extends test {
    public void display() {
        System.out.println("printed from test1 class");
    }
}
public class Nml {
    public static void main(String args[]) {
        test1 a=new test1();
        a.display();
    }
}
