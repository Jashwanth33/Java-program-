import java.util.Scanner;
class Reverse{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=0;
int reverse=0;
while(n>0){
r=n%10;
n=n/10;
reverse=reverse*10+r;
}
System.out.println(reverse);
}
}