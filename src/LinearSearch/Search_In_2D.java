package LinearSearch;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class Search_In_2D {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	

	int[][] arr=new int[3][3];
	
	System.out.print("Enter the Elements  :-");
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
			arr[row][col]=in.nextInt();
	}
		}
	
	System.out.println("Elements are :- ");
	for(int row=0;row<arr.length;row++) {
		  System.out.println(Arrays.toString(arr[row]));
		}
	
	System.out.print("Enter the target :-");
	int target=in.nextInt();
	
	int[] ans=linearsearch(arr,target);
	System.out.println("Index :- "+Arrays.toString(ans));
	
}
static int[] linearsearch(int[][]arr,int target) {
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
		if(arr[row][col]==target) {
			return new int[]{row,col};
			
		}
	}
		}
	
	return new int[]{-1,-1};

	}
}

