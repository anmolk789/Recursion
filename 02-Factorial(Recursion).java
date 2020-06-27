import java.util.*;
public class Factorial {
	public static int fact(int n) {
		//Base Case
		if(n==0 || n==1) {        //Expectation(k+1)
			return 1;             // n *(n-1)*(n-2)*3*2*1
		}                         //Faith(k)  
		                          //(n-1)*(n-2)*(n-3)*3*2*1
		//Recursion+Return
		return n*fact(n-1);
		
	}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		System.out.println(fact(n));
	}

}
