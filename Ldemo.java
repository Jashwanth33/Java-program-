
import java.util.Scanner;
class Ldemo{
public static void main(String k[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=a & b;
int d=a|b;
int e=~b;
int f=a>>2;
int g=a<<2;
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);

}
}