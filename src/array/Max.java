package array;

public class Max {
public static void main(String[] args) {
	
	int[] arr= {45,78,98,89};
	System.out.println(max(arr));
}

static int max(int[] arr){
	
	int maxvalue=arr[0];
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>maxvalue) {
			maxvalue=arr[i];
		}
	}
	return maxvalue;
}
}
