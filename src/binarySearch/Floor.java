package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Floor {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int[] arr= {2,3,5,9,14,16,18};
		
		System.out.println("Array:- "+Arrays.toString(arr));
		System.out.print("Enter the target :- ");
		int target=in.nextInt();
		
		int ans=floor(arr,target);
		System.out.println(ans);
	}
	static int floor(int arr[],int target) {
		
		int start=0;
		int end=arr.length-1;
		int mid;
		while(start <=end) {
			
			mid= start + (end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		
		return end;
	}
	}
