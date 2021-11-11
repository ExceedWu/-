class test {
    double x,y;
}

public class Nml {
    public static void main(String args[]) {
        test A = new test();
        test B = new test();
        test avg = new test();
        A.x = 5.2;
        A.y = 3.9;
        B.x = 6.5;
        B.y = 4.6;
        avg.x = (A.x + B.x) / 2;
        avg.y = (A.y + B.y) / 2;
        System.out.println("x = " + A.x + " y = " + A.y);
        System.out.println("x = " + B.x + " y = " + B.y);
        System.out.println("x = " + avg.x + " y = " + avg.y);
    }
}
