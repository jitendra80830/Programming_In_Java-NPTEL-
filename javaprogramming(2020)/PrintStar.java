//Write a program which will print a pyramid of "*" 's of height "n" and print the number of "*" 's in the pyramid
import java.util.Scanner;

public class PrintStar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=0,sum=0;
		for(int i=1;i<=n;++i,k=0){
			for(int space=1;space<=n-i;++space){
				System.out.print("  ");
			}
			while(k!=2*i-1){
				System.out.print("* ");
				sum=sum+1;
				++k;
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}































































































































  