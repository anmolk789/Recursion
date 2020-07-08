
public class queenCombinations1 {
	static int counter=0;
	public static void queenCombinations(boolean chess[][],int lastQueenPlaced,String answerSoFar,int lastQueenBox) {
		//BaseCase
		if(lastQueenPlaced==chess.length) {
			if(isChessBoardValid(chess)==true) {
				counter++;
				System.out.println(counter+"."+answerSoFar);
				return;
			}
		}
		
		//Recursive Case
		for(int box=lastQueenBox+1;box<chess.length*chess.length;box++) {
			int row=box/chess.length;
			int col=box%chess.length;
			
			if(chess[row][col]==false){
				chess[row][col]=true;
				queenCombinations(chess, lastQueenPlaced+1,answerSoFar+"Queen "+(lastQueenPlaced+1)+" Box "+box,box);
				chess[row][col]=false;
				
			}
		}
	}

	private static boolean isChessBoardValid(boolean[][] chess) {
		for(int row=0;row<chess.length;row++) {
			for(int col=0;col<chess[row].length;col++) {
				if(chess[row][col]==true) {
					if(isTheQueenSafe(chess,row,col)==false) {
						return false;
					}
				}
			}
		}
			return true;
		}

	private static boolean isTheQueenSafe(boolean[][] chess, int row, int col) {
		//Finding the enemy queen position
		  int directions[][]= {
				  {0,-1}, //North  (x,y)
				  {+1,-1}, //NE
				  {+1,0}, //East
				  {+1,+1}, //SE
				  {0,+1}, //South
				  {-1,+1}, //SW
				  {-1,0}, //West
				  {-1,-1} //NW

		  };
		  for(int directionindex=0;directionindex<directions.length;directionindex++) {
			  for(int distance=1;true;distance++) {
				  int enemyQueenCol=col+distance*directions[directionindex][1];
				  int enemyQueenRow=row+distance*directions[directionindex][0];
				  
				  if(enemyQueenCol<0 || enemyQueenRow<0 || enemyQueenRow>=chess[0].length || enemyQueenCol>=chess.length) {
					  break;
				  }
				  
				  if(chess[enemyQueenRow][enemyQueenCol]==true) {
					  return false;
				  }
				  
			  }
		  }
		  return true;
	}

	public static void main(String[] args) {
		//We have a been given a chess board configuration in the form of 2-D Array
		//We need to print all the positions on board when they cant each other
		//No of Queens that can be placed==>Chess.length
		
		boolean chess[][]=new boolean[4][4];
		queenCombinations(chess,0,"",-1);
	}

}
