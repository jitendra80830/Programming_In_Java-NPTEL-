//Fibonacci sereise
import java.util.Scanner;

public class Fibbo{
	public static void main(Stringp[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ebter no of term: ");
		int n=sc.nextInt();
		static int a=0,b=1,c;
		System.out.print(a+" "+b);
		Fibbo f=new Fibbo();
		f.fib(n);
	}
	public void fib(i){
		
		if(i>=1){
			
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fib(i-1);
		}
	}
}
				
		
		
		