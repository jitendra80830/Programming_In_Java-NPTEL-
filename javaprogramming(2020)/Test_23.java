/*An array is defined and initialized in the following program.
You have to find the average of all odd numbers present in that array and print the same.
*/
import java.util.Scanner;

public class Test_23{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		double sum=0;
		System.out.println("Enter size of Arrays");
		n=sc.nextInt();
		
		System.out.println("Enter the Values of Arrays");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		double count=0;
		double avg;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				sum=sum+arr[i];
				count=count+1;
			}
		}
		if(count!=0){
			avg=sum/count;
		}
		else{
			avg=0;
		}
		System.out.println("Average = "+avg);
	}
}
			
			