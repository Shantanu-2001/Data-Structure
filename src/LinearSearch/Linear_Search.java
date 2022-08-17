package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;
public class Linear_Search {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int[] arr=new int[5];
	System.out.println("Enter the elements :- ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=in.nextInt();
}
	System.out.println("Elements are :- "+Arrays.toString(arr));
	System.out.println("Enter the Target Element:- ");
	int target=in.nextInt();
	int ls=search(arr,target);
	System.out.println(ls);
		
}
static int search(int[] array,int target) {
         
	if(array.length==0) {
		return -1;
	}
	for(int index=0;index<array.length;index++) {
		int element;
		element=array[index];
		if(element==target) {
			return index;
		}
		
	}
	return -1;
}
}