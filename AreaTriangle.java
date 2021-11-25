import java.lang.*;
import java.util.*;
class AreaTriangle{
	public static void main(String extraArgs[]){
		float breadth,height,area;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter breadth of the triangle: ");
		breadth=sc.nextFloat();
		System.out.print("Enter height of the triangle: ");
		height=sc.nextFloat();
		area=0.5f*breadth*height;
		System.out.printf("area of the triangle: %.2f\n",area);

		// float x=5.2f,z=0.5f,y;
		// y=x+z;
		// System.out.println(y);
	}
}