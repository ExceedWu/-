class test {
    private static double pi=3.14;
    private double radius;
    double all =0;

    public test() {
        this(1.0);
    }
    public test(double r) {
        radius=r;
    }
    public  double setX(test a[]){
        for (int i =0 ;i<a.length;i++){
            all = all+a[i].radius*a[i].radius*pi;
        }
        return all;
    }
}

public class Nml {
    public static void main(String args[]) {
        test a[]=new test[5];
        a[0]=new test(1.0);
        a[1]=new test(1.0);
        a[2]=new test(1.0);
        a[3]=new test(1.0);
        a[4]=new test(1.0);
        test b =new test();
        System.out.println(b.setX(a));
    }
}
