
/**
 * 
 */
package tedst;

class A1 {
	
	 int width;
	 int height;
	 int r1;
	 int gross;
	 
	 
	 
	 void setG(int g)  
	   {
	      gross=g;
	   }
	 void setW(int w)  
	   {
	      width=w;
	   }

	 void setR(int r) 
	   {
	      r1=r;
	   }
	   void setH(int h)  
	   {
	      height=h;
	   }
	   void show()
	   {
	      System.out.println("半徑 = "+ r1);
	      System.out.println("球形體積 = "+4*3.14159*r1*r1*r1/3);
	      System.out.println("長 = "+gross+" 寬 = "+width+" 高 = "+height);
	      System.out.println("立方體表面積 = "+(gross*width*2+width*height*2+gross*height*2));
	   }
	   void setWindows(int w,int h,int r)
	   {
	      width=w;
	      height=h;
	      r1=r;
	   }
	}
	  

/**
 * @author CJCU-CC
 *
 */
public class class01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 cw = new A1();
		cw.setW(5);
	    cw.setH(6);
	    cw.setR(10);
	    cw.setG(4);
	    cw.show();
	    int b = 0;
	    
	}

}
// 半徑 = 10
// 球形體積 = 4188.786666666667
// 長 = 4 寬 = 5 高 = 6
// 立方體表面積 = 148
