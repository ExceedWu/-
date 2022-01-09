interface data{
    public void show();
    public double vol();
}
abstract  class test implements data{
    final double pi=3.14;
    protected int x;
    protected int y;
    protected int radius;
    public void show() {
        System.out.println("球心:("+x+","+y+")");
        System.out.println("半徑:"+radius);
        System.out.println("球體積:"+vol());
    }
    public double vol() {
        return ((4.0/3)*pi*radius*radius*radius);
    }
}
class circle extends test{
    public circle(int a,int b,int r) {
        x=a;
        y=b;
        radius=r;
    }
}

public class Nml {
    public static void main(String args[]) {
        circle A = new circle(8,6,2);
        A.show();
    }
}
