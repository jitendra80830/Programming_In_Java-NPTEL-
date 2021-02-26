/*Read the size of an array from keyboard.
 You have to declare an integer array of the provided size and insert the elements into it by reading from keyboard.
 You have to find the minimum number in that array and print the same.
*/
import java.util.Scanner;

public class Test_22{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s;
		System.out.println("Enter the Size of Array");
		s=sc.nextInt(); //defined array's size
		
		System.out.println("Enter the values of  Arrays");
		int arr[] = new int[s]; //Defined an array
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("The minimum of of Arrays is "+min);
	}
}
	