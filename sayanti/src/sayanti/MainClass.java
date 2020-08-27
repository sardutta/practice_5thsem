package sayanti;
import java.io.*;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args)throws IOException {
		double n,sum=0;
				int a,count=1;
		double avg;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of n");
    n=sc.nextDouble();
    while(count <= n)
    {
    	System.out.println("enter the "+count +" th number");
    	a=sc.nextInt();
    	sum+=a;
    	
    	count++;
    }
    avg= sum/n;
    System.out.println("sum is "+sum);
    System.out.println("average of number is"+avg);
	}
}
    


 