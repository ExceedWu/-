class test1{
    public static void test(int num,int den) throws ArithmeticException
    {
        System.out.println(num+"/"+den+"="+num/den);
    }

}
public class Nml {
        public static void main(String args[]) {
            try{
                test1.test(5,0);
            }
            catch (ArithmeticException e){
                System.out.println("除數為0");
            }
            finally{
                System.out.println("end of main() method!!");
            }
        }
}

