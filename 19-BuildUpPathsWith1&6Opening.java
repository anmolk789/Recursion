public class Paths1and6 {
	static int counter=0;
	public static void printBuildPathsWith1And6(int src,int dest,String pathSoFar) {
		//BaseCase
		if(src==dest) {
			counter++;
			System.out.println(counter+"."+pathSoFar);
			return;
		}
		 
		if(src==0) {
			printBuildPathsWith1And6(1, dest, pathSoFar+1);
			printBuildPathsWith1And6(1, dest, pathSoFar+6);
		}
		else {
			for(int dice=1;dice<=6;dice++) {
				int intermediate=src+dice;
				//Proactive
				if(intermediate<=dest) {
				printBuildPathsWith1And6(intermediate, dest, pathSoFar+(int)dice);
			}
		}}
		
	}
	

	public static void main(String[] args) {
		//We are in a board game where we can open with 1 and 6 only and place yourself at 1.
		//We Need to reach from Source To Destination
		//Print No of Paths
		printBuildPathsWith1And6(0, 10,"");
	}

}
