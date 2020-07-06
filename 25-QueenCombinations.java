
public class combinations {
	static int counter=0;
	public static void combinationOfQueens(boolean boxes[],int noOfQueens,int queensPlaced,String answerSoFar, int lastQueenPlaced) {
		//Base Case
		if(queensPlaced==noOfQueens) {
			counter++;
			System.out.println(counter+"."+answerSoFar);
		}
		//Recursive Case
		//If a box is covered then we need to cover the boxes ahead of it
		//Box0==>1,2,3(can be covered) by Queen
		//Box1==>2,3 as (1 and 0) are covered in previous call as (0 and 1)
		//Box2==>3 (Total=6)
		
		
		for(int box=lastQueenPlaced+1;box<boxes.length;box++) {
			if(boxes[box]==false) {
				boxes[box]=true;
				combinationOfQueens(boxes, noOfQueens, queensPlaced+1, answerSoFar+" Queen "+(queensPlaced+1)+" Box "+box, box);
				boxes[box]=false;
			}
		}
	}
	public static void main(String[] args) {
		//We are given an array as boxes(n) and we need to place items like Queens(r)
		//We need to find combinations in which they can be placed.
		// n! *r!/(n-r)! ==> n C r
		
		//Function Call
		boolean boxes[]=new boolean[4];
		combinationOfQueens(boxes, 2, 0, "",-1);
		
		//Starting from -1 as the value is Increased in the for loop;
		//If it is 0 it will start placing from Box1

	}

}
