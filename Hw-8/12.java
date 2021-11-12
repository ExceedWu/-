class test {
    int width;
    int height;
    String name;

    void setW(int w){
        width = w;
    }
    void setH(int h){
        height = h;
    }
    void setName(String s){
        name = s;
    }
    void setWindows(int w , int h , String s){
        width = w;
        height = h;
        name = s;
    }
    public void show(){
        System.out.println("Name = "+name);
        System.out.println("W = "+width+" H = "+height);
    }
}

public class Nml {
    public static void main(String args[]) {
        test num = new test();
        num.setName("My name");
        num.setW(5);
        num.setH(3);
        num.show();
        num.setWindows(1,2,"My Windows");
        num.show();
    }
}
