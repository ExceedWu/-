class test {
    private int num;
    public test(int n){
        num=n;
    }
    public int get(){
        return num;
    }

}
class data extends  test{
    public data(int n){
        super(n);
    }
    public void show(){
        System.out.println("num = "+get());
    }
}
public class Nml {
    public static void main(String args[]) {

        data a = new data(2);
        a.show();
    }
}
