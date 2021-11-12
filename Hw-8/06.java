class test {
    double pi = 3.14;
    double radius;
    void setX(){
        System.out.println("periphery = "+2*pi*this.radius);
    }
}

public class Nml {
    public static void main(String args[]) {
        test cir1 = new  test();
        cir1.radius = 3.0;
        cir1.setX();
    }
}
