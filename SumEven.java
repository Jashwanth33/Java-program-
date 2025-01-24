import java.util.Scanner;
class SumEven{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int sum=0;
for(int i=2 ;i<=n;i=i+2)
sum+=i;
System.out.println(sum);
}
}