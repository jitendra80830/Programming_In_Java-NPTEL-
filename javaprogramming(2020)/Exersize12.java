//find the largest among three numbers x, y, and z. You should use if-then-else construct in Java
import java.util.Scanner;

public class Exersize12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers of x,y and z");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int result=0;
		
		if(x>=y && x>=z)
		{
			result=x;
		}
		else if(y>=z)
		{
			result=y;
		}
		else
		{
			result=z;
		}
		System.out.println("largest number = "+result);
	}
}
		