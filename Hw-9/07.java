class test {
    double num  = 0;
    public static void power(int x ,int y){
        double num=Math.pow(x,y);
        System.out.println(num);
    }
}
public class Nml {
    public static void main(String args[]) {
        test a = new test();
        a.power(2,3);

    }
}
