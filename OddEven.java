import java.util.Scanner;
class OddEven
{
public static void main(String [] a)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
if(num%2==0)
{
System.out.println("Even");
}
else
{
System.out.println("odd");
}
}
}
