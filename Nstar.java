import java.util.Scanner;
class Nstar{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
for(int i=0;i<=n;i++)
{
for(int j=0;j<=n;j++){
System.out.print("* ");
}
System.out.println("");
}
}
}