/*The following program is intended to calculate the sum of first 'n' even integer numbers excluding zero. 
Write the appropriate statement to complete the program given below*/
import java.util.Scanner;

public class Test_11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		
		while(i>0){
			if(n==0){
				break;
			}
			if(i%2==0){
				sum=sum+i;
				n--;
			}
			i++;
		}
		System.out.print(sum);
	}
}