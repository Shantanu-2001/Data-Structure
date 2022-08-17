package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest_Letter {
public static void main(String[] args) {
	
Scanner in =new Scanner(System.in);
	
	char[] arr= {'b','c','e','i','j','k'};
	System.out.println(" ARRAY :- "+Arrays.toString(arr));
	
	System.out.println(" ENTER THE TARGET :- ");
	char target=in.next().trim().charAt(0);
	
	
	char ans=smallest_character(arr,target);
	System.out.println("CEILING :- "+ans);
}
static char smallest_character(char[] arr,char target) {
	int start=0;
	int end=arr.length-1;
	int mid;
	
	while(start<=end) {
		mid=start+(end-start)/2;
		if(target>arr[mid]) {
			start=mid+1;
		}
		else{
			end=mid-1;
		}
		
	}
	
	return arr[start % arr.length];
}
}
