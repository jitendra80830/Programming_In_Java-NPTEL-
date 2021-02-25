/*A user will input any character and a program will print if the input character is a consonant.
Write appropriate statements below to complete the following program
Your program should print 'Consonant' .*/
import java.util.Scanner;

public class Test_14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		char con[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int flag=0;
		for(int i=0;i<con.length;i++){
			if(con[i]==ch){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.print("Constant");
		}
	}
}
				
  