import java.util.Scanner;
class WashTime
{
public static void main(String [] a)
{
Scanner s=new Scanner(System.in);
int qty=s.nextInt();
String level=s.next();
if(qty<=2000){
 if (level.equals("L"))
{System.out.println("Time estimated: 25 minutes");
}
else
{
System.out.println("Invalid");
}
}
else if(qty>2000&&qty<4001)
{
if (level.equals("M"))
{System.out.println("Time estimated: 35 minutes");
}
else
{
System.out.println("Invalid");
}
}
else if(qty>4000&&qty<7000)
{
if (level.equals("H"))
{System.out.println("Time estimated: 45 minutes");
}
else
{
System.out.println("Invalid");
}
}
else if(qty>7000)
{
System.out.println("0verloaded");
}
else
{
System.out.println("Invalid");

}
}
}


