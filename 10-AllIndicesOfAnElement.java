import java.util.*;
public class allIndices {
	public static int[] allIndicesInAnArray(int arr[],int search,int index,int count) {
		//Base Case
		//Return A Array Of Size Count So That We Can Store Position of the desired searched element
		if(index==arr.length) {
			return new int[count];
		}
		int[] res=null;
		//Recursion
		//Increase Count By 1 If We Find Our Desired Searched Element
		if(arr[index]==search) {
			res=allIndicesInAnArray(arr,search,index+1,count+1);
			res[count]=index;
		}else {
			//Dont Increase the count but Increase the Index
			res=allIndicesInAnArray(arr,search,index+1,count);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8,4,3,4,8};
		int search=obj.nextInt();
		int[] res=allIndicesInAnArray(arr,search,0,0);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
