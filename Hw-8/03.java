class test {
    String name ;
    double BMI;
    void setX(double height,double weight){
        BMI = weight/(height*height);

    }

}

public class Nml {
    public static void main(String args[]) {
        test student = new test();
        student.name = "Sandy";
        student.setX(165.5,58.2);
        System.out.println(student.name+" BMI : "+student.BMI);
    }
}
