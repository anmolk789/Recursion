import java.util.*;
public class TargetSumAL {
	 static int counter=0;
	public static void targetSum(int arr[],int target,int index,int setSum,ArrayList<Integer> list) {
		//Base List
		if(index==arr.length) {
			if(setSum==target) {
				counter++;
				System.out.println(counter+"."+list);
			}
				return;
		}
		
		//RecursionCalls
		list.add(arr[index]);
		targetSum(arr, target,index+1, setSum+arr[index], list);
		list.remove(list.size()-1);
		targetSum(arr,target,index+1,setSum,list);
		
	}

	public static void main(String[] args) {
		//Print the combinations by which a certain sum can be achieved
		int arr[]= {10,20,30,40,50,60,70};
		targetSum(arr,70,0,0,new ArrayList<>());

	}

}
