package LinearSearch;

import java.util.Scanner;
public class Minimum_Number {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	
	int[] arr=new int[5];
	System.out.print("Enter the elements in the array = ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=in.nextInt();
	}
	
	System.out.println("9"+minimum(arr));
	
	
}
static int minimum(int[] arr){	
	int ans=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<ans) {
			ans=arr[i];
		}
	}
	return ans;
	
}
}
