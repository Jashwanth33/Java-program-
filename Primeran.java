import java.util.Scanner;
class Primeran{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int o= sc.nextInt();
int p= sc.nextInt();
for(int k=o;k<p;k++){
int n=k;
int f=0;
for(int i=2;i<n;i++){
if(n%i==0)
{
f=1;
break;
}
}
if(f==0){
System.out.println(k);
}
}
}
}
