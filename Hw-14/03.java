import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Nml {
    public static void main(String args[]) throws IOException {
        int k ,sum=0;
        BufferedReader buf ;
        buf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.print("輸入一個整數 : ");
        str=buf.readLine();
        k=Integer.parseInt(str);

        for(int i=1;i<=k;i++)
            sum = sum + i;
        System.out.println("1+2+...+"+k+"="+sum);
    }
}
