class test {
    private int length;
    private  int height;
    private  int width;
    public test (int l , int h , int w){
        length = l;
        width = w;
        height = h;
    }
    public void show(){
        System.out.println("length = "+length);
        System.out.println("height = "+height);
        System.out.println("width = "+width);
    }
}

public class Nml {
    public static void main(String args[]) {
        test a = new test(1,2,3);
        a.show();
    }
}
