package CTI_Stuff;
import java.util.*;
public class Making_A_Triangle {
	public static void main(String[] args) {
		Scanner something = new Scanner(System.in);
		
		System.out.println("Please give me a value for x");
		double sideOne= something.nextDouble();
		
		System.out.println("Please give me another value for z");
		double sideTwo= something.nextDouble();
		
		double total= 0;
		
		total= (sideOne*sideTwo)*0.5;
		
		System.out.println("This is the area of the triangle "+total);
		
		
	}

}


/*
 													Translate into python
base = float(input("Enter the base length of the triangle: "))
height = float(input("Enter the height of the triangle: "))

area =0.5 * base * height
print("The area of the triangle is:", area)
*/