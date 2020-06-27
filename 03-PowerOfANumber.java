import java.util.*;
public class Power {
	private static int power(int no,int pow) {
		//Base Case
		if(pow==0) {
			return 1;
		}
		//Recursive Case
		int aStepBefore=power(no,pow-1);//Faith (no*no*no)
		int ans=no*aStepBefore;//Expectation (no*no*no*no)
		return ans;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=obj.nextInt();
		System.out.println("Enter the Power:");
		int p=obj.nextInt();
		System.out.println(power(n,p));
	}

}
