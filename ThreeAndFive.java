package CTI_Stuff;
import java.util.*;
public class ThreeAndFive {
	public static void main(String[] butt) {
		Scanner something= new Scanner(System.in);
		System.out.println("Gimme a value");
		double n = something.nextDouble();
		
		
		
		for(int innie=0;innie<=n;innie++) {
			boolean forFive= innie%5==0;
			boolean forThree= innie%3==0;
			if(forFive&&forThree) {
				System.out.println("FizzBuzz");
			}
			else if(forFive) {
				System.out.println("Buzz");
			}
			else if (forThree) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(innie);
			}
		}
	}

}
