
import java.util.Scanner;
class Diamond1{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++){
   for(int j=i;j<n-1;j++)
   {
     System.out.print(" ");
   }
for(int k=0;k<=i;k++){
    System.out.print("* ");
}
System.out.println();
}
for(int i=n-1;i>0;i--){
   for(int j=i;j<=n-1;j++)
   {
     System.out.print(" ");
   }
for(int k=0;k<i;k++){
    System.out.print("* ");
}
System.out.println();
}
}
}
