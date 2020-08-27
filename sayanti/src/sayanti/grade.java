package sayanti;
import java.io.*;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		double n,sum=0;
		int a,count=1;
double avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of subjects");
n=sc.nextDouble();
while(count <= n)
{
System.out.println("enter marks of"+count+"th subject");
a=sc.nextInt();
sum+=a;

count++;
}
avg= sum/n;
//System.out.println("sum is "+sum);
System.out.println("average of number is"+avg);
if (avg >=9)
	System.out.println("O");
if(avg < 9 && avg >=8)
	System.out.println("E");
if(avg < 8 && avg >=7)
	System.out.println("A");
if(avg < 7 && avg>=6)
	System.out.println("B");
if(avg < 6 && avg >=5)
	System.out.println("C");
if(avg<5 && avg >=4)
	System.out.println("D");
else if(avg< 4)
	System.out.println("F");

}

	}


