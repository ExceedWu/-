import java.util.Scanner;

class test {
    void setX(int x){
        if(x==0){
            System.out.println("此數為0");
        }
        if(x%2 ==0 && x!=0){
            System.out.println("此數為偶數");
        }
        if(x%2 !=0){
            System.out.println("此數為奇數");
        }

    }
}

public class Nml {
    public static void main(String args[]) {
        test num = new test();
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        num.setX(value);
    }
}
