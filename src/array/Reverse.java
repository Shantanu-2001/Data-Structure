package array;

import java.util.Arrays;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	
	int[] arr= {1,4,6,7,8};
	
	int start=0;
	int end=arr.length-1;	
	int temp;
	while(start<end) {
	    temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	
	System.out.println(Arrays.toString(arr));
}
}
