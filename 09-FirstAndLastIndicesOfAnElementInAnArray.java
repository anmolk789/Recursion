import java.util.*;
public class firstAndLastIndices {
	public static int firstIndex(int arr[],int search,int index) {
		//Searching for the first Index we've to search it before the next call
		//Base Case
		if(index==arr.length) {
			return -1;
		}
		//LookUp
		if(search==arr[index]) {
			return index;
		}else {
			//Recursion Call
			int firstIndexInSmallerArray=firstIndex(arr,search,index+1);
			return firstIndexInSmallerArray;
		}
	}
	public static int lastIndex(int arr[],int search,int index) {
		//Searching for the last index we've to search it after the recursive call(from the end of the call stack)
		//Base Case
		if(index==arr.length) {
			return -1;
		}
		
		//Recursive Call
		int lastIndexInSmallerArray=lastIndex(arr,search,index+1);
		//LookUp
		if(lastIndexInSmallerArray!=-1) {
			return lastIndexInSmallerArray;
		}else {
			if(search==arr[index]) {
				return index;
			}
			else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,8,9,2,1,3};
		System.out.print("Enter the element to be search for:");
		int element= obj.nextInt();
		System.out.print("FirstIndex:");
		System.out.print(firstIndex(arr,element,0));
		System.out.println();
		System.out.print("LastIndex:");
		System.out.print(lastIndex(arr,element,0));

	}

}
