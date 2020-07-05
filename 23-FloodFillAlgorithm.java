
public class buildsPathsWithObjections {
	static int counter=0;
	public static void floodFill(int srcRow,int srcCol,int maze[][],boolean visited[][],String pathSoFar) {
		
		//Reactive Approach
		if(srcRow==maze.length-1 && srcCol==maze[0].length-1) {
			counter++;
			System.out.println(counter+"."+pathSoFar);
			return;
		}
		
		if(isThisNotAValidPath(srcRow,srcCol,maze)==true || visited[srcRow][srcCol]==true) {
			return;
		}
		
		visited[srcRow][srcCol]=true;
		
		floodFill(srcRow+1,srcCol,maze,visited,pathSoFar+"D");
		floodFill(srcRow,srcCol+1,maze,visited,pathSoFar+"R");
		floodFill(srcRow,srcCol-1,maze,visited,pathSoFar+"L");
		floodFill(srcRow-1,srcCol,maze,visited,pathSoFar+"T");
		
		visited[srcRow][srcCol]=false;
	}
	
	public static boolean isThisNotAValidPath(int srcRow,int srcCol,int maze[][]) {
		if(srcRow>maze[0].length-1 || srcCol>maze.length-1) {
			return true;
		}else if(srcRow<0 || srcCol<0) {
			return true;
		}else if(maze[srcRow][srcCol]==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// We are given with a 2-D Array Where 1 denotes a FreeSpace and 0 denotes a Objection
		//Path Motion-Down,Left,Top and Bottom 
		//We need to print the path
		int maze[][]= {
						{1,0,1,1},
						{1,1,1,1},
						{1,0,1,1},
						{1,1,0,1}
					};
		//To Store The Position is Visited/NotVisible.We need the same dimensional boolean Array
		boolean visited[][]=new boolean[maze.length][maze[0].length];
			
		
	floodFill(0,0,maze,visited,"");

	}

}
