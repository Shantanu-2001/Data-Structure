package LinearSearch;
import java.util.Scanner;
public class SearchInStrings {
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the String :- ");
		String str=in.next();
		
		System.out.println(" String = "+str);
		
		System.out.print("Enter the character:- ");
		char target=in.next().trim().charAt(0);
		
		System.out.println(" Character =  "+target);
		
		System.out.println(search(str,target));
		
		
		
		
	}
	static boolean search(String str,char target) {
		
		char c;
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
