interface data{
    public void show();
}
class cb{
    public int num = 10;
    public void set(int n){
        num = n;
    }
}
class test extends cb implements data{
    public void show(){
        System.out.println("num = "+num);
    }
}
public class Nml {
    public static void main(String args[]) {
        test A = new test();
        A.set(5);
        A.show();
    }
}
