class test {
    private static double pi=3.14;
    private double radius;
    double x =0;
    public test(double r) {
        radius=r;
    }
    public double show() {
        x = pi*radius*radius;
        return x;
    }
}

public class Nml {
    public static void main(String args[]) {
        double all = 0 , average =0;
        test a[] = new test[3];
        a[0]=new test(1.0);
        a[1]=new test(2.0);
        a[2]=new test(3.0);
        all=a[0].show()+a[1].show()+a[2].show();
        average = all/3;
        System.out.println(average);
    }
}
