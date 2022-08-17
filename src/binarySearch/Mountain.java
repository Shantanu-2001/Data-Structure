package binarySearch;

public class Mountain {
public static void main(String[] args) {
	int[] arr= {0,1,2,0};
	int ans=peakIndexinMountainArray(arr);
	System.out.println("peak index :- "+ans);
}
static int peakIndexinMountainArray(int[] arr) {
	int start=0;
	int end=arr.length-1;
	
	while(start<end) {
		int mid=start+(end-start)/2;
		if(arr[mid]>arr[mid+1]) {
			end=mid;
		}
		else {
			start=mid+1;
		}
	}
	
	return start;
	
}
}
