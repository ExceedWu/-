class RadiusIsNegative extends Exception {
}

class RadiusTooLarge extends Exception {
}

class circle {
    private double radius;
    public void setRadius(double r) throws RadiusIsNegative,RadiusTooLarge {
        if(r<0){
            throw new RadiusIsNegative();
        }
        else if(r>100){
            throw new RadiusTooLarge();
        }
        else {
            radius = r;
        }
    }
    public void show()
    {
        System.out.println("area="+3.14*radius*radius);
    }
}

public class Nml {
    public static void main(String args[]) {
        circle cir=new circle();
        try {
            cir.setRadius(120);
        }
        catch(RadiusIsNegative e) {
            System.out.println(e+" throwed");
        }
        catch(RadiusTooLarge e) {
            System.out.println(e+" throwed");
        }
        cir.show();
    }
}
