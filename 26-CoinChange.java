
public class coinChange {
	static int counter=0;
	public static void coinChangeCombinations(int amount,int coins[],int lastCoinUsed,String answerSoFar) {
		//Base Case
		if(amount==0) {
			counter++;
			System.out.println(counter+". "+answerSoFar);
			return;
		}
		
		//For Numbers of Coins
		for(int denoms=lastCoinUsed;denoms<coins.length;denoms++) {
			//We need to hide permutations so denoms starts with lastCoinUsed
			if(amount>=coins[denoms]) {
			coinChangeCombinations(amount-coins[denoms],coins,denoms,answerSoFar+coins[denoms]);
		}
	}}
	public static void main(String[] args) {
		//We have been given an amount which needs to made with certain denominations present in an array
		//We need to consider the combinations.
		
		int coins[]= {2,3,5,6};
		coinChangeCombinations(20, coins, 0,"");
	}

}
