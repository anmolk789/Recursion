import java.util.*;
public class TowerOfHanoi {
	private static void towerOfHanoi(String src,String dest,String helper,int n) {
		//Base Case
		if(n==0) {
			return;
		}
		//Recursive Case
		towerOfHanoi(src,helper,dest,n-1); //1
		System.out.println("Move "+n+" from "+src+" to "+dest);//2
		towerOfHanoi(helper,dest,src,n-1);//3
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		towerOfHanoi("A","B","C",n);
	}
	          //Print Statement(2)
			 // //   |  // //
			//   //  |  //  //
			 //   // //    //              //Fig-Motion In Recursion 1->2->3
			  //         //
	//Pre(1)-->       //       // <--Post(3)

}
