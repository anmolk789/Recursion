
public class printSubsequences {
	public static void printStringSubsequences(String question,String answerSoFar) {
		
		//Base Case
		if(question.length()==0) {
			System.out.println(answerSoFar);
			return;
		}
		 
		char ch=question.charAt(0);
		String res=question.substring(1);
		//We Have 2 option-either dont select or select and add in the answersSoFar
		printStringSubsequences(res,answerSoFar);
		printStringSubsequences(res,answerSoFar+ch);
		printStringSubsequences(res, answerSoFar+(int)ch);
	}

	public static void main(String[] args) {
		
		printStringSubsequences("ab","");
	}

}
