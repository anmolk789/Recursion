
public class EquiSum {
	public static void equiSum(int arr[],int index,int subSet1,String answerSoFar1,int subSet2,String answerSoFar2) {
		//Base Case
		if(index==arr.length) {
			if(subSet1==subSet2) {
				System.out.println(answerSoFar1+" & "+answerSoFar2);
			}
			return;
		}
		
		//Recursion Call for 1st Set
		equiSum(arr, index+1, subSet1+arr[index], answerSoFar1+arr[index]+" ", subSet2,answerSoFar2);
		
		//Recusrion call for 2nd Set
		equiSum(arr, index+1, subSet1, answerSoFar1, subSet2+arr[index],answerSoFar2+arr[index]+" ");
		
	}

	public static void main(String[] args) {
		//Given a array find all the sets which sums equal
		int arr[]= {10,20,30,40,50,60,70};
		
		//Function Call With String
		equiSum(arr,0,0,"",0,"");

	}

}
