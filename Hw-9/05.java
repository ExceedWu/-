class test {
    private staic int count = 0;
    private static double pi = 3.14;
    private double radius;

    public test() {
        this(1.0);
    }

    public test(double r) {
        radius = r;
        count++;
    }
    public void show_count() {
        System.out.println(count+" object(s) created");
    }
    public void setZero(){
        count = 0;
        System.out.println(count+" object(s) created");
    }
    public void setValue(int n){
        count = n;
        System.out.println(count+" object(s) created");
    }
}
public class Nml {
    public static void main(String args[]) {
        test a = new test();
        test b = new test(3);
        test c = new test(5);
        test d = new test();
        c.show_count();
        c.setZero();
        d.setValue(100);
    }
}
