/*Read a character from keyboard .
You have to check whether it is vowel or not. 
If it is vowel print "vowel" otherwise print "Not_vowel".
*/
import java.util.Scanner;

public class Test_24{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character and check whether it is vowel or not");
		char ch=sc.next().charAt(0);
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o'||ch=='O' || ch=='u' || ch=='U'){
			System.out.println("Vowel");
		}
		else{
			System.out.println("Not Vowel");
		}
	}
}
		
		
		