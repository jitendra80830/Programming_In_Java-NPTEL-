/*Complete the following program that is intended to find and print the maximum value stored in an array 'arr[]'.*/
import java.util.Scanner;

public class Test_12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[20];
		
		int x[]= {1,2,3,8,5,2,1,9,45,3,7,2,10,65,4,9,33,12,6,76};
		int y[]= {1,2,3,8,5,2,1,9,45,3,7,324,545,56,78,98,34,22,13,1};
		if(sc.nextInt()==1){
			arr=x;
		}
		else{
			arr=y;
		}
		int temp;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.print(arr[arr.length-1]);
	}
}
		
		
