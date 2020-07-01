import java.util.*;
public class subsequencesString {
	
	public static ArrayList<String> getStringSubsequences(String str){
		
		//Expectation-->(ab)--> " ", "b" , "a", "ab"
		//Faith-->(b)-->" " ,"b"
		//So,Expectation=Faith + a*Faith
		
		//Base Case
		if(str.length()==0) {
			ArrayList<String> baseCaseList=new ArrayList<>();
			baseCaseList.add(" ");
			return baseCaseList;
		}
		
		char ch=str.charAt(0);
		String res=str.substring(1);
		
		//Recursive Call
		ArrayList<String> result=getStringSubsequences(res);
		
		ArrayList<String> addResult=new ArrayList<>();
		for(String stringValues:result) {
			addResult.add(stringValues);
			addResult.add(ch+stringValues);
		}
		return addResult;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		ArrayList<String> printList=new ArrayList<String>();
		printList=getStringSubsequences(s);
		for(String k:printList) {
			System.out.print(k+" ");
		}
	}

}
