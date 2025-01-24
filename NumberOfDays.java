import java.util.Scanner;
class NumberOfDays
{
public static void main(String [] a)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the  Month number");
int num=s.nextInt();
if(num==1)
{
System.out.println("january has 31 days");
}
else if(num==2)
{
System.out.println("February has 28 days");
}
else if(num==3)
{
System.out.println(" March has 31 days");
}
else if(num==4)
{
System.out.println(" April has 31 days");
}
else if(num==5)
{
System.out.println("May has 31 days");
}
else if(num==6)
{
System.out.println(" June has 30 days");
}
else if(num==7)
{
System.out.println(" July has 31 days");
}
else if(num==8)
{
System.out.println(" August has 31 days");
}
else if(num==9)
{
System.out.println(" September has 30 days");
}
else if(num==10)
{
System.out.println(" Octomber has 31 days");
}
else if(num==11)
{
System.out.println("November has 31 days");
}
else if(num==12)
{
System.out.println("Decemberhas 31 days");
}
else
{
System.out.println("Invalid");
}
}
}