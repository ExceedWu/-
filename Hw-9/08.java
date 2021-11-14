class test {
    private static  int cut = 0;
    private int height = 0;
    private int width = 0;
    private String color;

    public test(String str, int w ,int h){
        color = str;
        width = w;
        height = h;
        cut++;
        System.out.println("color = "+color +" width = "+width+" height = "+height);
    }
    public test(){
        this.color="red";
        this.width=2;
        this.height=2;
        cut++;
        System.out.println("color = "+color +" width = "+width+" height = "+height);
    }
    public void count(){
        System.out.println(cut+" object(s) created");
    }
    public void setZero(){
        cut = 0;
        System.out.println(cut+" object(s) created");
    }
    public void setValue(int n){
        cut = n;
        System.out.println(cut+" object(s) created");
    }

}
public class Nml {
    public static void main(String args[]) {
        test a =new test();
        test b =new test("blue",1,2);
        b.count();
        a.setZero();
        a.setValue(200);
    }
}
