package LinearSearch;
import java.util.Arrays;
import java.util.Scanner;
public class MaximumWealth {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	
	System.out.println(" Enter the Wealth of people:-");
	
	int[][] wealth=new int[3][3];
	for(int person=0;person<wealth.length;person++) {
		for(int account=0;account<wealth[person].length;account++){
			
			wealth[person][account]=in.nextInt();
		}
	}
	
	System.out.println(" Wealth of people:-");
	
	for(int person=0;person<wealth.length;person++) {

             System.out.println(Arrays.toString(wealth[person]));
	}
	
	int sum=0;
	int ans=Integer.MIN_VALUE;
	for(int person=0;person<wealth.length;person++) {
		for(int account=0;account<wealth[person].length;account++){
			
			sum=sum+wealth[person][account];
			
			if(sum>ans) {
				ans=sum;
			}		
		}
	}
	System.out.println(ans);
	

 }
}
