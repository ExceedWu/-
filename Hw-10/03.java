class test {
    public  int num1;
    public  int num2;
    test(){
        num1=1;
        num2 = 1;
    }
    test(int a,int b){
        this.num1 = a;
        this.num2 = b;
    }
}
class test1 extends test{
    test1(int a,int b){
        super(a,b);
        System.out.println(num1+num2);
    }
}
public class Nml {
    public static void main(String args[]) {
        test1 a = new test1(1,2);

    }
}
