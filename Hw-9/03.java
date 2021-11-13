class test {
    public int value;
    public test(){
        value = 10;
        System.out.println("value = "+value);
    }
    public  test(int i ){
        value = i;
        System.out.println("value = "+value);
    }
}

public class Nml {
    public static void main(String args[]) {
        test a = new test();
        test b = new test(12);

    }
}
