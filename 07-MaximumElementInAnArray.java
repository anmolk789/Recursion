import java.util.*;
public class maxInArray {
	public static int maxElementInArray(int arr[],int index) {
		//BaseCase
		if(index==arr.length-1) //Because A Single Element is Max When Compared With Itself
		{ 
			return arr[index];
		}
		
		//Recursive Case
	        int max=maxElementInArray(arr, index+1);
	        //Comparing Return Value With The Index-1;
		if(max>arr[index]) {
			return max;
		}else {
			return arr[index];
		}
	}

	public static void main(String[] args) {
		int arr[]= {111,-1,5,11,10};
		System.out.println(maxElementInArray(arr,0));
	}

}
