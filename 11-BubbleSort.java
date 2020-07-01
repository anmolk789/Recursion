import java.util.*;
public class bubbleSorting {
	private static void bubbleSort(int arr[],int start,int end) {
		//Line 1
		if(end==0) {
			return;
		}
		
		//Line2//
		if(start == end) {
			//We Need To Decrease our End Because Last Element is Sorted and Start to Zero
			
			bubbleSort(arr,0,end-1);
			return;
			
			//Base Case for End.So-->Line 1
			
		}
		
		//First Task Is Swapping With Subsequent Increase in the StartIndex
		if(arr[start]>arr[start+1]) {
			int temp=arr[start];
			arr[start]=arr[start+1];
			arr[start+1]=temp;
		}
		//Getting out of that If Statement and Recursively calling the function with (Start+1)
		
		bubbleSort(arr,start+1,end);
		
		//With this last element is the largest and we need to have a base case for Start.So-->Line 2
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,201,-1,-4,100,76,43};
		bubbleSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
