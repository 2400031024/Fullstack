package MyPackage;
import java.lang.Math;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x value: ");
		double x = sc.nextDouble();
		double y;
		y = Math.sqrt(x);
		System.out.println("y = "+y);
	}

}
