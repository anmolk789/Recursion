
public class permutationString {
	static int counter=0;
	public static void printStringPermutations(StringBuilder str,StringBuilder answerSoFar) {
		//Base Case
		if(str.length()==0) {
			counter++;
			System.out.println(counter+"."+answerSoFar);
			return;
		}
		
		//Recursive Call
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			str.deleteCharAt(i);//Retreiving From String
			answerSoFar.append(ch);//Insertion
			
			printStringPermutations(str, answerSoFar);
			
			answerSoFar.deleteCharAt(answerSoFar.length()-1);//Deletion
			str.insert(i,ch);//Inserting in String
		}
	}

	public static void main(String[] args) {
		// We have a string,print all the permutations we can do with that string
		
		printStringPermutations(new StringBuilder("abc"),new StringBuilder(""));
	}

}
