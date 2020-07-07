
public class coinChange2 {
	static int counter=0;
	public static void coinChangePermuatations(int amount,int coins[],String answerSoFar) {
		//Base case
		if(amount==0) {
			counter++;
			System.out.println(counter+"."+answerSoFar);
			return;
		}
		
		//Recursive Case
		for(int denoms=0;denoms<coins.length;denoms++) {
			if(amount>=coins[denoms]) {
				coinChangePermuatations(amount-coins[denoms], coins, answerSoFar+coins[denoms]);
			}
		}
	}
	

	public static void main(String[] args) {
		//We need to print all the permutations of all the ways a required amount can be made.
		//Provided with a coins array giving the denominations
		int coins[]= {2,3,5,6};
		coinChangePermuatations(10, coins,"");

	}

}
