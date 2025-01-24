import java.util.Scanner;
class PosNeg
{
public static void main(String [] a)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
if(num>=0)
{
System.out.println(num+" is positive");
}
else
System.out.println(num +" is negative");
}
}