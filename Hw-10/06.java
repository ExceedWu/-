class test {
    protected int x;
    protected int y;

    public test(int x1, int y1) {
        x= x1;
        y =y1;
    }

    protected void show(){
        System.out.println("x = "+x+" y = "+y);
    }

}
class test1 extends  test{
    test1(int x , int y){
        super(x,y);
        System.out.println("x = "+x+" y = "+y);
        System.out.println("area = "+(x*y)/2);
    }
}
public class Nml {
    public static void main(String args[]) {
        test1 a = new test1(3,8);
    }
}
