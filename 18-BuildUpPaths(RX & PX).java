
public class Paths {
	static int counter=0;
	public static void printNoOfPathsReactive(int src,int dest,String pathSoFar) {
		//Base Case
		if(src==dest) {
			counter++;
			System.out.println(counter+". "+ pathSoFar);
			return;
		}
		//Reactive Case: We Let That Mistake Happen and then return.Affects Time Complexity
		if(src>=dest) {
			return;
		}
		
		
		//No Of Calls= 6 Because [1-6] on Dice
		for(int dice=1;dice<=6;dice++) {
			
			//Finding an Intermediate(InBetween Stages To Build Up That Number)
			int intermediate=src+dice;
			//Recursion Call from Intermediate to Destination and Adding Dice Value To PathSoFar
			printNoOfPathsReactive(intermediate,dest,pathSoFar+(int)dice);
			
		}
	}

	public static void printNoOfPathsProactive(int src,int dest,String pathSoFar) {
		//Base Case
		if(src==dest) {
			counter++;
			System.out.println(counter+". "+ pathSoFar);
			return;
		}
		
		
		//No Of Calls= 6 Because [1-6] on Dice
		for(int dice=1;dice<=6;dice++) {
			
			//Finding an Intermediate(InBetween Stages To Build Up That Number)
			
			int intermediate=src+dice;
			
			//Proactive Case:We dont let the mistakes happen as it can affect our time complexity
			
			if(intermediate<=dest) {
			//Recursion Call from Intermediate to Destination and Adding Dice Value To PathSoFar
			printNoOfPathsReactive(intermediate,dest,pathSoFar+(int)dice);
			
		}}
	}
	
	public static void main(String[] args) {
		
		//We have been provided with a dice and we need to find no of ways we can make up a number through that dice.
		
		printNoOfPathsReactive(0,10,"");
		printNoOfPathsProactive(0,8,"");
	}

}
