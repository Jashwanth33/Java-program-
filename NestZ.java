import java.util.Scanner;
class NestZ{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++){
  for(int j=0;j<n;j++){
  if(i==0 || i==n-1||j==n-i-1)
    System.out.print("*");
else
System.out.print(" ");

}
System.out.println();
}
}
}


