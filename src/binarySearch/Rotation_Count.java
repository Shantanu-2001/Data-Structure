package binarySearch;

public class Rotation_Count {
public static void main(String[] args) {
	
	int[] arr= {3,4,5,6,2};
	int count=countrotations(arr);
	System.out.println(count);
}
static int countrotations(int[] arr) {
	int pivot=findpivot(arr);
	return pivot+1;
}
static int findpivot(int[] arr) {
	
	int start=0;
	int end=arr.length-1;
	
	while(start<=end) {
		int mid=start+(end-start)/2;
		
		if(arr[mid]>arr[mid+1]) {
			return mid;
		}
		else if(arr[mid]<arr[mid-1]) {
			return mid-1;
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
