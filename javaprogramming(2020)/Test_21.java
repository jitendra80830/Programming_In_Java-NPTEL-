//calculate the sum of first 'n' odd integer numbers
import java.util.Scanner;

public class Test_21{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int result=1;
		int i=0;
		int sum=0;
		
		while(result<=n){
			if(i%2!=0){
				sum=sum+i;
				result=result+1;
			}
			i=i+1;
		}
		System.out.println(sum);
	}
}
				