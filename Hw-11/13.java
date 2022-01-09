interface data{
    public void show();
}
interface Math extends data{
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
}
class test implements Math{
    public int ans;
    public void add(int a,int b) {
        ans=a+b;
    }
    public void sub(int a,int b) {
        ans=a-b;
    }
    public void mul(int a,int b) {
        ans=a*b;
    }
    public void div(int a,int b) {
        ans=a/b;
    }
    public void show(){
        System.out.println("ans = "+ans);
    }
}
public class Nml {
    public static void main(String args[]) {
        test A = new test();
        A.mul(3,5);
        A.show();
    }
}
