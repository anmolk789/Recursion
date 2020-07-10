import java.util.ArrayList;
public class EquiSum {
	public static void equiSum(int arr[],int index,int subSet1,ArrayList<Integer> list1,int subSet2,ArrayList<Integer> list2) {
		//Base Case
		if(index==arr.length) {
			if(subSet1==subSet2) {
				System.out.println(list1+" & "+list2);
			}
			return;
		}
		
		//Recursion Call for 1st Set
		list1.add(arr[index]);
		equiSum(arr, index+1, subSet1+arr[index],list1, subSet2,list2);
		list1.remove(list1.size()-1);
		
		//Recursion Call for 2nd Set
		list2.add(arr[index]);
		equiSum(arr, index+1, subSet1, list1, subSet2+arr[index],list2);
		list2.remove(list2.size()-1);
		
	}

	public static void main(String[] args) {
		//Given a array find all the sets which sums equal
		int arr[]= {10,20,30,40,50,60,70};
		
		//Function Call With String
		equiSum(arr,0,0,new ArrayList<>(),0,new ArrayList<>());

	}

}
