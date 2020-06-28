import java.util.*;
public class printArray {
	private static void arrayPrint(int arr[],int Index) {
		//Base Case
		if(Index==arr.length)//It Has Reached The End of Array,So Return
		{
			return;
		}
		//Recursive Case
		System.out.print(arr[Index] +" ");    //Expectation(E)--> 5 3 9 12
		arrayPrint(arr,Index+1);     //Faith(F)= 3 9 12 ,So E=syso +F.
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int arr[]= {5,3,9,12};
		arrayPrint(arr,0);
	}

}
