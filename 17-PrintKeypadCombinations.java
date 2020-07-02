
public class printKeypad {
	
	static String keycodes[]= {".","abc","def","ghi","jkl","mnop","qrs","tuv","wx","yz"};
	
	public static void printKeypadCombinations(String question,String answerSoFar) {
		//Base Case
		if(question.length()==0) {
			System.out.println(answerSoFar);
			return;
		}
		
		char ch=question.charAt(0);
		String resultSoFar=question.substring(1);
		String charCodes=keycodes[ch-'0'];
		
		for(int i=0;i<charCodes.length();i++) {
			char charChoices=charCodes.charAt(i);
			printKeypadCombinations(resultSoFar, answerSoFar+charChoices);
		}
	}
	public static void main(String[] args) {
		
		printKeypadCombinations("179","");
	}

}
