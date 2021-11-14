class test {
    private int length;
    private int height;
    int all = 0;
    private void show(){
        System.out.println("length = "+length);
        System.out.println("height = "+height);
    }
    test(){
        length = 2;
        height = 2;
    }
    test(int l,int h){
        this.length = l;
        this.height = h;
    }
    void area(){
        all=length*height;
        System.out.println("length = "+length);
        System.out.println("height = "+height);
        System.out.println("all = "+all);
    }
}
class num extends test{
    num(int l,int h){
    super(l,h);
    }

}
public class Nml {
    public static void main(String args[]) {
        test a = new test(3,8);
        num a1 = new num(3,8);
        a.area();
        a1.area();
    }
}
