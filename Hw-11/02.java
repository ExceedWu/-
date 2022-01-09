abstract class Math{
    protected int ans;
    public void show(){
        System.out.println("ans = "+ans);
    }
    public abstract void add(int a ,int b);
    public abstract void sub(int a ,int b);
    public abstract void mul(int a ,int b);
    public abstract void div(int a ,int b);

}
class test extends Math{
    public void add(int a ,int b){
        ans = a+b;
    }
    public void sub(int a ,int b){
        ans = a-b;
    }
    public void mul(int a ,int b){
        ans = a*b;
    }
    public void div(int a ,int b){
        ans = a/b;
    }
}
public class Nml {
    public static void main(String args[]) {
        test A = new test();
        A.add(10,5);
        A.show();
        A.sub(10,5);
        A.show();
    }
}
