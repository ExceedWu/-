class test {
    public static void w(int n){
        int num = 0;
        for (int i =1 ; i<=n ; i++){
            num = num+i;
        }
        System.out.println(num);
    }
}
public class Nml {
    public static void main(String args[]) {
        test a = new test();
        a.w(10);
    }
}
