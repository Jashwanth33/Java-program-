import java.util.Scanner;
class Leapyear
{
public static void main(String [] a)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the year");
int num=s.nextInt();
if((num%4==0&&num%100!=0)||num%400==0)
{
System.out.println("Leap year");
}
else
{
System.out.println("Not leap year");
}
}
}