
public class nKnights {
	static  int counter=0;
	public static void nKnightsProactive(boolean chess[][],int lastKnightPlaced,String answerSoFar,int lastKnightBox) {
		//Base Case
		if(lastKnightPlaced==chess.length) {
			counter++;
			System.out.println(counter+" ."+answerSoFar);
			return;
		}
		
		for(int box=lastKnightBox+1;box<chess.length*chess.length;box++) {
			int row=box/chess.length;
			int col=box%chess.length;
			if(chess[row][col]==false) {
				if(isTheKnightSafe(chess,row,col)==true) {
					chess[row][col]=true;
					nKnightsProactive(chess, lastKnightPlaced+1, answerSoFar+"Knight "+(lastKnightPlaced+1)+" Box "+box+" ", box);
					chess[row][col]=false;
				}
			}
		}
	}
	
	private static boolean isTheKnightSafe(boolean[][] chess, int row, int col) {
		int directions[][]= {
							{+1,-2}, //North
							{+2,-1}, //NE
							{+2,+1}, //East
							{+1,+2}, //SE
							{-1,+2}, 
							{-2,+1}, 
							{-2,-1}, 
							{-1,-2}

		};
		//We dont have to take care of Distance here
		for(int directionIndex=0;directionIndex<directions.length;directionIndex++) {
			
			int enemyKnightR=row+directions[directionIndex][1];
			int enemyKnightC=col+directions[directionIndex][0];
			
			if(enemyKnightR<0 || enemyKnightC<0 || enemyKnightC>=chess[0].length || enemyKnightR>=chess.length) {
				continue;
				//Look for other values ,Dont Break It!!!
			}
			if(chess[enemyKnightR][enemyKnightC]==true) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		//We have been given a chess board in the form of 2-D array
		// We need to find out how can we place knights so that they cant cut each other
		boolean chess[][]= new boolean [3][3];
		nKnightsProactive(chess, 0,"",-1);
	}
}
