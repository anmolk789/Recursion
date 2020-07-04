public class buildPathsInMaze {
	static int counter =0;
	public static void printMazePathsMultiMoves(int srcRow,int srcCol,int destRow,int destCol,String pathSoFar) {
		//Base Case
		if(srcRow==destRow && srcCol==destCol) {
			counter++;
			System.out.println(counter+"."+pathSoFar);
			return;
		}
		//Reactive Approach
		if(srcRow>destRow || srcCol>destCol) {
			return;
		}
		
		//HorizontalCall-Adding  Column
		for(int moves=1;moves<=destCol-srcCol;moves++)
			printMazePathsMultiMoves(srcRow,srcCol+moves,destRow,destCol,pathSoFar+"H"+moves);
		
		//VerticalCall-Adding  Row
		for(int moves=1;moves<=destRow-srcRow;moves++)
			printMazePathsMultiMoves(srcRow+moves,srcCol,destRow,destCol,pathSoFar+"V"+moves);
		
		//DiagonalCall-Adding  Row and Column
		for(int moves=1;moves<=destRow-srcRow && moves<=destCol-srcCol;moves++)
			printMazePathsMultiMoves(srcRow+moves, srcCol+moves, destRow, destCol, pathSoFar+"D"+moves);
		
	}

	public static void main(String[] args) {
		//We Have provided a Maze in the form of 2-D Array
		//Only Motion Allowed-Horizontal and Vertical(MultiplesSteps it can take at a time)
		//You are standing at the left top and you have to make your way to right bottom with motion allowed
		//Print the Path
		
		//Function Call
		printMazePathsMultiMoves(0, 0, 2, 2, "");
	}

}
