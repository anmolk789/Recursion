import java.util.*;
public class keypadCombinations {
	
	static String keypad[]= {".","abc","def","ghi","jkl","mno","pq","rst","qv","wxyz"};
	
	public static ArrayList<String> getKeypadCombinations(String str){
		//Base Case
		if(str.length()==0) {
			ArrayList<String> baseCaseList=new ArrayList<String>();
			baseCaseList.add("");
			return  baseCaseList;
		}
		
		
		char ch=str.charAt(0);
		String res=str.substring(1);
		//Recursive Call
		ArrayList<String> result=getKeypadCombinations(res);
		
		ArrayList<String> addedList=new ArrayList<String>();
		
		for(String stringValues : result) {
			String keys=keypad[ch-'0']; //0 is 48
			for(int i=0;i<keys.length();i++) {
			char alpha=keys.charAt(i);
			addedList.add(alpha + stringValues);
			}
	}
		return addedList;
	}

	public static void main(String[] args) {
		System.out.print(getKeypadCombinations("123"));

	}

}
