
public class permutations {
	static int counter=0;
	public static void permutationsOfQueensInBoxes(boolean boxes[],int noOfQueens,int queensSoFar, String answerSoFar) {
		//Base Call
		if(queensSoFar>=noOfQueens) {
			counter++;
			System.out.println(counter+". "+answerSoFar);
			return;
		}
		//Recursive
		for(int box=0;box<boxes.length;box++) {
			if(boxes[box]==false) {
				boxes[box]=true;//Not to place in the same Box
				permutationsOfQueensInBoxes(boxes, noOfQueens, queensSoFar+1, answerSoFar+" Queen "+(queensSoFar+1)+" Box "+(box));
				boxes[box]=false;//This is to make sure other call be can be done
			}
		}
	}

	public static void main(String[] args) {
	
		//We Have Been Given a array denoting Boxes(n)
		//We Need To Place an item lets say Queen into that boxes.(r)
		//No of Permutations will be n!/(n-r)! ==>n P r
		
		//Function Call
		boolean boxes[]=new boolean[4];
		permutationsOfQueensInBoxes(boxes,2,0,"");
	}

}
