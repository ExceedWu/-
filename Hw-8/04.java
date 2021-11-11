class test {
    int height , width , length ;
}

public class Nml {
    public static void main(String args[]) {
        test x = new test();
        x.height = 25;
        x.length = 15;
        x.width = 10;
        System.out.println("length = "+x.length);
        System.out.println("height = "+x.height);
        System.out.println("width = "+x.width);
    }
}
