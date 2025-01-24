import java.util.Scanner;
class Isfib{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double x=5*n*n-4;
double y=5*n*n+4;
int a=(int) Math.sqrt(x);
int b=(int) Math.sqrt(y);
if(a*a==x||b*b==y)
System.out.println("isfib");
else
System.out.println("Not fib");
}
}


