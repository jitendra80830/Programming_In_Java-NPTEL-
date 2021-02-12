//find the perimeter and area of a circle given a value of radius
import java.util.Scanner;

public class Exersize11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		double perimeter;
		double radius;
		double area;
		radius=sc.nextDouble();
		
		if(radius<=0){
			System.out.println("please enter non zero positive number ");
		}
		else
		{
			perimeter=2*Math.PI*radius;
			area=Math.PI*radius*radius;
			System.out.println("Perimeter = "+perimeter);
			System.out.println("Area=  "+area);
		}
	}
}
		
	