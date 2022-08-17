package binarySearch;

import java.util.Arrays;
import java.util.Scanner;
public class Order_Agnostic_Binary_Search {
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	
	
int[] arr= {2,4,6,9,11,12,14,20,36,48};
	
	System.out.println("Array:- "+Arrays.toString(arr));
	
	System.out.print("Enter the target :- ");
	int target=in.nextInt();
	
	int ans=orderAgnosticBS(arr,target);
	
	System.out.println(ans);
	
}
static int orderAgnosticBS(int[] arr,int target) {
	

	int start=0;
	int end=arr.length-1;
	int mid;
	
	// find whether the array is ascending or descending.
	boolean isAsc= arr[start]<arr[end];
	
	while(start <=end) {
		
		mid= start + (end-start)/2;
		
		if(target==arr[mid]) {
			return mid;
		}
		
		if(isAsc) {
			if(target<arr[mid]) {
				end=mid-1;
			}
			else{
				start=mid+1;
			}
			}
			else {
				if(target>arr[mid]) {
					end=mid-1;
				}
				else{
					start=mid+1;
				}
				
			}
		}
	
	return -1;

}
}
