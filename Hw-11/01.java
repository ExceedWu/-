abstract class CShape{
    protected String color;
    public void setColor(String str){
        color = str;
    }
}
class test extends CShape{
    protected int width , height;
    public test(int w , int h){
        width = w ;
        height = h ;
    }
    public void show(){
        System.out.print("color = "+color+",  ");
        System.out.println("area = "+ width * height);
    }
}
public class Nml {
    public static void main(String args[]) {
        test A = new test(5,10);
        A.setColor("Yellow");
        A.show();

    }
}
