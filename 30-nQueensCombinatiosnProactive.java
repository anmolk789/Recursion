
public class nQueens {
	static int counter=0;
	public static void nQueensProactive(boolean chess[][],int lastQueenPlaced,String answerSoFar,int lastQueenBox) {
		//Base Case
		if(lastQueenPlaced==chess.length) {
			counter++;
			System.out.println(counter+". "+answerSoFar);
			return;
		}
		//Recursive Case
		//Converting into numbers
		for(int box=lastQueenBox+1;box<chess.length*chess.length;box++) {
			//Row and Column
			int row=box/chess.length;
			int col=box%chess.length;
			if(chess[row][col]==false) {
				//Proactive Approach
				if(isTheQueenSafe(chess,row,col)==true) {
				chess[row][col]=true;
				nQueensProactive(chess, lastQueenPlaced+1, answerSoFar+"Queen"+(lastQueenPlaced+1)+" Box "+box,box);
				chess[row][col]=false;
			}
		}
	}
	}

	private static boolean isTheQueenSafe(boolean[][] chess, int row, int col) {
		// TODO Auto-generated method stub
	 int directions[][]= {
			 {0,-1},//North
			 {+1,-1},//NE
			 {+1,0},//East
			 {+1,+1},//SE
			 {0,+1},//South
			 {-1,+1},//SW
			 {-1,-0},//West
			 {-1,-1}//NW
	 };
	 for(int dirIndex=0;dirIndex<directions.length;dirIndex++) {
		 for(int distance=1;true;distance++) {
			 int enemyQueenRow=row+distance*directions[dirIndex][0];
			 int enemyQueenColumn=col+distance*directions[dirIndex][1];
			 
			 if(enemyQueenColumn<0 || enemyQueenRow<0 || enemyQueenColumn>=chess.length || enemyQueenRow>=chess[0].length) {
				 break;
			 }
			 if(chess[enemyQueenRow][enemyQueenColumn]==true) {
				 return false;
			 }
		 }
	 }
	 return true;
	}

	public static void main(String[] args) {
		
		long start =System.currentTimeMillis();
		boolean chess[][]= new boolean[4][4];
		
		nQueensProactive(chess,0,"",-1);
		
		long end=System.currentTimeMillis();
		System.out.println(end-start);

	}

}
