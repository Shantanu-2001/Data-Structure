package array;

import java.util.Arrays;

public class Swap {
public static void main(String[] args) {
	
	int[] arr= {112,34,56,78,98,89};
	
	swap(arr,1,4);
	
	System.out.println(Arrays.toString(arr));
}

static void swap(int[]arr ,int index1,int index2) {
	
	int temp=arr[index1];
	arr[index1]=arr[index2];
	arr[index2]=temp;
	
}
}