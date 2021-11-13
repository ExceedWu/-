class test {
    int width;
    int height;

    test(int width , int height){
        this.width = width ;
        this.height = height ;

    }
}

public class Nml {
    public static void main(String args[]) {
        test a = new test(10,8);
        System.out.println("width = "+a.width);
        System.out.println("height = "+a.height);

    }
}
