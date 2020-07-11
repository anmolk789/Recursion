
public class permutationString {
	static int counter=0;
	public static void printStringPermutations(String str,String answerSoFar) {
		//Base Case
		if(str.length()==0) {
			counter++;
			System.out.println(counter+"."+answerSoFar);
			return;
		}
		
		//Recursive Call
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String left=str.substring(0,i);
			String right=str.substring(i+1);
			String addedString=left+right;
			
			printStringPermutations(addedString, answerSoFar+ch);
		}
	}

	public static void main(String[] args) {
		// We have a string,print all the permutations we can do with that string
		
		printStringPermutations("abc","");
	}

}
