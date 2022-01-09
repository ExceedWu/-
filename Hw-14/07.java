import java.io.*;
public class Nml {
    public static void main(String args[]) throws IOException
    {
        int num=0;
        String str;
        FileReader fr=new FileReader("c:\\java\\donkey.txt");
        BufferedReader bfr=new BufferedReader(fr);

        while((str=bfr.readLine())!=null)
        {
            if(num==1)
                bfr.skip(14);
            System.out.println(str);
            num ++;
        }
        fr.close();
    }
}
