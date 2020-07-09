
public class TargetSum {
	static int counter=0;
	public static void targetSum(int array[],int target,int index,String answer,int subset) {
		//Base Case
		if(index==array.length) {
			if(subset==target) {
				counter++;
				System.out.println(counter+"."+answer);
				};
				return;
		}
		//Recursively Calling
		//1.To take a element from array and add to the subset and check for the target
		//2.Dont take the element but increase the Index.
		
		targetSum(array,target,index+1,answer+array[index]+" ",subset+array[index]);//This has to be the first call
		targetSum(array,target,index+1,answer,subset);
	}

	public static void main(String[] args) {
		//We are given an array of numbers and a target number
		//Print all the combinations which can sum upto that target
		 int array[]= {10,20,30,40,50,60,70};
		 targetSum(array,70,0,"",0);
	}

}
