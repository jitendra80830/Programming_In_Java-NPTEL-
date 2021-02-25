/*print the average value of all the even numbers including zero stored in the array (arr[] ).*/
import java.util.Scanner;

public class Test_13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int arr[] = new int[6];
		
		int x[]={4,9,33,18,0,76};
		int y[]={45,0,7,324,545,57};
		if(sc.nextInt()==1){
			arr=x;
		}
		else{
			arr=y;
		}
		double total=0.0,count=0.0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				total=total+arr[i];
				count++;
			}
		}
		double avg=total/count;
		System.out.print(avg);
	}
}