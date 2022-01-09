interface data{
    public void show();
    public abstract void add(int a ,int b);
    public abstract void sub(int a ,int b);
    public abstract void mul(int a ,int b);
    public abstract void div(int a ,int b);
}
interface momo{
    public abstract void mod(int a ,int b);
    public abstract void fac(int a );
    public abstract void pow(int a ,int b);
}
class test implements data,momo{
    public int num;
    public void add(int a ,int b){
        num = a+b;
    }
    public void sub(int a,int b) {
        num=a-b;
    }
    public void mul(int a ,int b){
        num = a*b;
    }
    public void div(int a,int b) {
        num=a/b;
    }
    public void mod(int a ,int b){
        num = a%b;
    }
    public void fac(int a){
        num = 1;
        for(int i =1 ; i <= a ; i++){
            num = num * i;
        }
    }
    public void pow(int a,int b) {
        num = 1;
        for(int i=1;i<=b;i++)
            num=num*a;
    }
    public void show(){
        System.out.println("num = "+num);
    }
}

public class Nml {
    public static void main(String args[]) {
        test A = new test();
        A.mul(3,5);
        A.show();
        A.mod(14,5);
        A.show();
        A.fac(5);
        A.show();
    }
}
