package array;

import java.util.Arrays;

public class Function {
public static void main(String[] args) {
	
	int [] arr= {2,4,6,8};
	
	System.out.println(Arrays.toString(arr));
	change(arr);
	
	System.out.println(Arrays.toString(arr));
	
}
static void change(int[] Array) {
	Array[0]=100;

}
}
