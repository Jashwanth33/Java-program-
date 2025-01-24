import java.util.Scanner;
class Mul{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int m=1;
for(int i=1;i<=n;i++)
m*=i;
System.out.println(m);
}
}