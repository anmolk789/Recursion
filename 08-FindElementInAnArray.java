import java.util.*;
public class findInArray {
	private static boolean findElementInArray(int arr[],int search,int index) {
		//BaseCase
		if(index==arr.length) {
			return false;
		}
		
		//RecursiveCase
		if(search==arr[index]) {   //Comparing at the start of the fuction instead of comparing from the end
			return true;
		}else {
			boolean findInASmallerArrayFISA=findElementInArray(arr,search,index+1);
			return findInASmallerArrayFISA;
		}
	}

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int arr[]= {1,-11,0,55,43};
		int search=obj.nextInt();
		System.out.println(findElementInArray(arr,search,0));
	}

}
