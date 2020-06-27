import java.util.*;
public class printNumbers {
	public static void printIncreasing(int n) {
		//BaseCase
		if(n==0) {
			return;
		}
		//Recursive Call
		printIncreasing(n-1);
		System.out.println(n);
	}
	public static void printDecreasing(int n) {
		//Base Case
		if(n==0) {
			return;
		}
		//Recursive Call
		System.out.println(n);
		printDecreasing(n-1);
	}
	public static void printDecreasingIncreasing(int n) {
		//BaseCase
		if(n==0) {
			return;
		}
		//Recursive Call
		System.out.println(n);
		printDecreasingIncreasing(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		//Function Call 1
	    printIncreasing(n);
	    System.out.println();
	    //Function Call 2
	    printDecreasing(n);
	    System.out.println();
	    //Function Call 3
	    printDecreasingIncreasing(n);
	}

}
