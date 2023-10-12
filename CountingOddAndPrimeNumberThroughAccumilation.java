package Homework1_OddNumbers_and_Cards;
import java.util.*;
public class CountingOddAndPrimeNumberThroughAccumilation {
	public static void main(String[] args) {
		Scanner something = new Scanner (System.in);
		System.out.println("Please gimme a number");
		int number = something.nextInt();
		
		int resultCount= checkingNumber(number);
		System.out.println("This is the result of the thing: "+resultCount);
		
		double percent = (((double) resultCount / number)) * 100;
		System.out.println("This is the percentage: %"+percent);
		
		checkingPrime(number);
		
		something.close();
	}
	public static int checkingNumber(int number) {
		int count =0; 
		for(int innie=0; innie<=number; innie++) {
			if(innie%2!=0) {
				count++;
			}
		}
		return count;
	}
	public static void checkingPrime(int number) {
		boolean blah=false;
		for(int innie=0; innie<= number; innie++) {
			if(number%2!=0) {
				blah=true;
			}else {
				blah=false;
			}
		}
		
		if(blah) {
			System.out.println("this is a prime");
		}else if(blah==false) {
			System.out.println("this is not a prime");
		}else {
			System.out.println("nope either");
		}
	}

}
