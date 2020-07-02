import java.util.*;
public class stringSubquencesASCII {
	public static ArrayList<String> getStringSubsequencesASCII(String str){
		//Base Case
		if(str.length()==0) {
			ArrayList<String> baseCaseList=new ArrayList<>();
			baseCaseList.add(" ");
			return baseCaseList;
		}
		
		char ch=str.charAt(0);
		String res=str.substring(1);
		
		//Recursive Call
		ArrayList<String> result=getStringSubsequencesASCII(res);
		ArrayList<String> newAddedList=new ArrayList<String>();
		for(String stringValues:result) {
			//Every Element Has 3 Choices -Blank,Alphabet and ASCII Value.
			
			newAddedList.add(stringValues);
			newAddedList.add(stringValues+ch);
			newAddedList.add((int)ch+stringValues);
		}
		return newAddedList;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		ArrayList<String> printList=new ArrayList<String>();
		printList=getStringSubsequencesASCII(s);
		System.out.print(printList);
	}
}
