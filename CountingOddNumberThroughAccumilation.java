package Homework1_OddNumbers_and_Cards;
import java.util.*;
public class CountingOddNumberThroughAccumilation {
	public static void main(String[] args) {
		Scanner something = new Scanner (System.in);
		System.out.println("Please gimme a number");
		int maybeOdd= something.nextInt();
		
		int returningcounter= isItOdd(maybeOdd);
		System.out.println("This is the results of the odd numbers derived from your number: "+returningcounter);
		something.close();
	}
	public static int isItOdd(int maybeOdd) {
		int count=0;
		boolean flag= false;
		for(int innie=0; innie<=maybeOdd;innie++) {
			if(innie%2!=0) {
				count++;
				flag=true;
			}else {
				flag=false;
			}
		}
		
		if(flag) {
			System.out.println("This is an odd number");
		}else {
			System.out.println("This is not an odd number");
		}
		
		return count;
	}
	

}
