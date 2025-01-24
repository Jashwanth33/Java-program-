import java.util.Scanner;
class NestNumSe{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=1;
for(int i=1;i<=n;i++){
  for(int j=1;j<=i;j++){
    System.out.print(num++ +" ");
  }
System.out.println();
}
}
}


