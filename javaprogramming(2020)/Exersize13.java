/*Consider first n even numbers starting from zero(0)
Complete the code segment to calculate sum of  all these numbers divisible by 3 
 Print the sum.*/

import java.util.Scanner;

public class Exersize13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n numbers");
		int n=sc.nextInt();
		int sum=0;
		
		int result=1;
		int i=0;
		while(result<=n){
			if(i%2==0)
			{
				if(i%3==0)
				{
					sum=sum+i;
				}
				result=result+1;
			}
			i=i+1;
		}
		System.out.println(sum);
	}
}
		
