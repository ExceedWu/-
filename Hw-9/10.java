class test {
    public int n;
    public int d;
    public void setN(int num){
        n=num;
    }
    public void setD(int num){
        d=num;
    }
    public void show(){
        System.out.println(n+"/"+d);
    }
    public void setND(int num,int den){
        n = num;
        d = den;
        System.out.println(n+"/"+d);
    }
}
public class Nml {
    public static void main(String args[]) {
        test a = new test();
        a.setN(2);
        a.setD(5);
        a.show();
        a.setND(1,2);
    }
}
