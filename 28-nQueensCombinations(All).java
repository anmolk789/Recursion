
public class QueenCombinations {
	static int counter=0;
	public static void nQueenCombinations(boolean chess[][],int queenPlacedSoFar,String answerSoFar,int lastQueenPlaced) {
		//Base Case
		if(queenPlacedSoFar>=chess.length) {
			counter++;
			System.out.println(counter+" "+answerSoFar);
			return;
		}
		
		//Recursive Case
		//Treat Every Cell of the 2-D Array from (0,0) to(n-1,n-1) as a series of continous numbers.
		//For (0,0) to (3,3)==> 0,1,2.....15
		
		for(int box=lastQueenPlaced+1; box<chess.length*chess.length ; box++) {
			//Any Cell Row And Column Can Be Find Out By
			int row=box/chess.length;
			int column=box%chess.length;
			if(chess[row][column]==false) {
				chess[row][column]=true;
				nQueenCombinations(chess, queenPlacedSoFar+1, answerSoFar +"Queen "+(queenPlacedSoFar+1)+" Box "+box+" ",box);
				chess[row][column]=false;
			}
		}
		
	}

	public static void main(String[] args) {
		//We are given a chess board and we need to print all the valid positions where queens can sit.
		//No of Queens = Length of ChessBoard in our case 4
		
		boolean chess[][]=new boolean[4][4];
		nQueenCombinations(chess,0,"",-1);
		
		//Theory 16 C 4 ==> 1820

	}

}
