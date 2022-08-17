package binarySearch;

public class Rotated_Binary_Search {
public static void main(String[] args) {
	
	int[] arr= {4,5,6,7,0,1,2};
	System.out.println(findpivot(arr));
}
static int findpivot(int[] arr) {
	
	int start=0;
	int end=arr.length-1;
	
	while(start<=end) {
		int mid=start+(end-start)/2;
		
		if(arr[mid]>arr[mid+1]) {
			return arr[mid];
		}
		else if(arr[mid]<arr[mid-1]) {
			return arr[mid-1];
		}
		else if(arr[start]>=arr[mid]) {
			end=mid-1;
		}
		else if(arr[start]<arr[mid]) {
			start=mid+1;
		}
	}
	return -1;
	
}
}
