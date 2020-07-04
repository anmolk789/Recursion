public class buildPathsInMaze {
	static int counter =0;
	public static void printMazePathsDiagonals(int srcRow,int srcCol,int destRow,int destCol,String pathSoFar) {
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
		
		//HorizontalCall-Adding a Column
		printMazePathsDiagonals(srcRow,srcCol+1,destRow,destCol,pathSoFar+"H");
		
		//VerticalCall-Adding a Row
		printMazePathsDiagonals(srcRow+1,srcCol,destRow,destCol,pathSoFar+"V");
		
		//DiagonalCall-Adding a Row and Column
		printMazePathsDiagonals(srcRow+1, srcCol+1, destRow, destCol, pathSoFar+"D");
		
	}

	public static void main(String[] args) {
		//We Have provided a Maze in the form of 2-D Array
		//Only Motion Allowed-Horizontal,Vertical,Diagonal(One at a time)
		//You are standing at the left top and you have to make your way to right bottom with motion allowed
		//Print the Path
		
		//Function Call
		printMazePathsDiagonals(0, 0, 2, 2, "");
	}

}
