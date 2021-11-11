class test {
    int a,b,c;
}

public class Nml {
    public static void main(String args[]) {
        test obj = new test();
        obj.a = 5 ;
        obj.b = 3 ;
        obj.c = obj.a * obj.b ;
        System.out.println("a = "+obj.a + " b = "+obj.b+" c = "+obj.c);
    }
}
