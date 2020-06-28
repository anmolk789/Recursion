import java.util.*;
public class printReverseArray {
	public static void printArrayReverse(int arr[],int index) {
		//BaseCase
		if(index==-1) {
			return;
		}
		System.out.println(arr[index]);
		//Recursive Case
		printArrayReverse(arr, index-1);
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		printArrayReverse(arr,arr.length-1);
	}

}
