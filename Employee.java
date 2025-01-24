class Employee{
int empno;
String ename;
float salary;
Employee(int n,String en,float sal)
{
this.empno=n;
this.ename=en;
this.salary=sal;
}
void printdetails(){
System.out.println(ename+"earns  "+salary);
}
}
public class InstanceDemo{
public static void main(String []kk){
Employee e1=new Employee(123,"surya",45000);
printdetails();
}
}
