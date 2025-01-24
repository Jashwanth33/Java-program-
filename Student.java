class Student{
int vtuno;
String name;
String dept;
String fathername;
String mothername;
long contactnumber;
float marks[]=new float[15];
Student(int vtuno,String name,String dept,String fathername,String mothername,long contactnumber){
 this.vtuno=vtuno;
 this.name=name;
 this.dept=dept;
 this.fathername=fathername;
 this.mothername=mothername;
 this.contactnumber=contactnumber;
}
float findcgpa(int nsubjects){
float ans=0;
for(int i=0;i<nsubjects;i++){
ans=ans+marks[i];
}
return ans/nsubjects;
}
public static void main(String []kk){
Student s1=new Student(2320,"dhzash","cse","daddy","mummy",978688656L);
s1.marks=new float[]{66,77,88,99,99,88,77,88};
float ans1=s1.findcgpa(8);
System.out.println(ans1);
Student s2=new Student(2321,"gokul","cse","nakul","ammi",978687546L);
s2.marks=new float[]{66,72,88,91,99,81,79,89};
float ans2=s2.findcgpa(8);
System.out.println(ans2);
}
}


