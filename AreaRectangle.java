import java.util.*;

class AreaRectangle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the width of the rectangle: ");
		// This variable will capture the width of the rectangle
		float width = sc.nextFloat();
		System.out.print("Enter the length of the rectangle: ");
		// This variable will capture the length of the rectangle
		float length = sc.nextFloat();
		float Area=width*length;
		System.out.printf("The area of the reactangle is: %.2f",Area);
	}
}