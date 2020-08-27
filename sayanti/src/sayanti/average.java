package sayanti;
import java.io.*;
import java.util.Scanner;
public class average {

	public static void main(String[] args)throws IOException {
		Scanner sys=new Scanner(System.in);
		double a,b;
		double avg;
		System.out.println("enter value of a and b");
		a= sys.nextDouble();
		b=sys.nextDouble();
		avg=(a+b)/2;
		System.out.println("the average of a and b is "+ avg);
	}

}
