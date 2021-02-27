//Interface Program
import java.util.Scanner;

interface Number{
	int findCube(int i);
}
class A implements Number{
	int i;
	int cube;
	public int findCube(int i){
		cube=i*i*i;
		return cube;
	}
}
public class Test_25{
	public static void main(String[] args){
		A a = new A();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int findcude;
		findcude=a.findCube(n);
		System.out.println(findcude);
	}
}
	