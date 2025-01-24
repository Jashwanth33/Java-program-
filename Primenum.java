import java.util.Scanner;
class PrimeNum{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int f=0;
for(int i=2;i<=n;i++){
if(i==2||i==5||i==3){
System.out.println(i);
}
else if(i%2==0||i%5==0||i%3==0){

}
else
{
System.out.println(i);
}
}
}
}
