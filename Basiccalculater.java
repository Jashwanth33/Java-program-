import java.util.Scanner;
class BasicCalculater{
public static void main(String [] a)
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
char c=sc.next().charAt(0);
int res=0;
switch(c){
case '+':
res=num1+num2;
break;
case '-':
res=num1-num2;
break;
case '*':
res=num1*num2;
break;
case '/':
if(num2!=0)
res=num1/num2;
else
break;
case '%':
if(num2!=0)
res=num1+num2;
else
break;
default:
System.out.println("Invalid");}
System.out.println(res+"result");

}
}
