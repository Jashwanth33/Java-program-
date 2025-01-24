import java.util.Scanner;
class Neststar{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<=n;i=i++){
  for(int j=0;j<=i;j++){
if(i==0||i==n-1||j=n-1-i){
    System.out.print("* ");
  }
else
{
System.out.println();
}
}
System.out.println("  ");
}
}
}


