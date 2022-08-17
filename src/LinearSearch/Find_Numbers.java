package LinearSearch;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class Find_Numbers {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	
	int[] arr= new int[5];
	
	System.out.println(" Enter the Elements :- ");
	for (int i=0;i<arr.length;i++) {
		arr[i]=in.nextInt();
	}
	
	System.out.print(" Array :- ");
	System.out.println(Arrays.toString(arr));
	
	int count=0;
	int n;
	int even=0;
	for (int i=0;i<arr.length;i++) {
	  n=arr[i];
	  while(n>0){
		  count++;
		  n=n/10;	  
	  }
	  if(count %2 ==0) {
		  even++;
	  }
	  count=0;
	}
	
	System.out.println("The number of elements who have even length:-"+even);
	
}
}
