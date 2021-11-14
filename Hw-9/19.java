class test {
    private String name;
    private data score;
    class data{
        private int english;
        private int math;
        public data(int e,int m){
            english = e;
            math = m;
        }
        double avg(){
            return (english+math)/2.0;
        }
    }
    public test(String na,int e,int m){
        name=na;
        score=new data(e,m);
    }
    void show(){
        System.out.println("name : "+name);
        System.out.println("english = "+score.english);
        System.out.println("math = "+score.math);
        System.out.println("avg = "+score.avg());
    }
}

public class Nml {
    public static void main(String args[]) {
        test a = new test("Annie",85,92);
        a.show();
    }
}
