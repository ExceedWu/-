interface iShape03{
	public void show();
	public int area();
}
interface icolor{
	public void showColor();
}
class test{
	protected int width;
	protected int height;
	protected String color;
	
	public test(int w , int h , String str) {
		width = w;
		height = h;
		color = str;
	}
	public void show() {
		System.out.println("color = "+color);
		System.out.println("width = "+width);
		System.out.println("height = "+height);
		System.out.println("area = "+area());
		
	}
	public int area() {
		return (width*height);
	}
	public void showColor() {
		System.out.println(color);
	}
}
public class nml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test A = new test(5,7,"Green");
		A.show();
	}

}
