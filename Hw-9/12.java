class test {
    public int n;
    public int d;

    public test(int num,int den){
        n=num;
        d=den;
        System.out.println(n+d);
    }
    public void setND(int num,int den){
        n = num;
        d = den;
        System.out.println(n+d);
    }

    public void compare(test a){
        if(this.n==a.n)
            System.out.println("radius are equal");
        else
            System.out.println("radius are not equal");
    }
}
public class Nml {
    public static void main(String args[]) {
        test a1 = new test(5,5);
        test a2 = new test(3,7);
        a1.compare(a2);

    }
}
