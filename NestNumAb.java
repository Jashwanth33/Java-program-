import java.util.Scanner;
class NestNumAb{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
char num=65;
for(int i=1;i<=n;i++){
  for(int j=1;j<=i;j++){
    System.out.print(num++ +" ");
  }
if(num==97){
num=97;
}
System.out.println();
}
}
}


