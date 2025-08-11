//Inheritance
class Student
{
int fee=91000;
public void get()
{
System.out.println("IT STUDENTS:");
}
}
public class ITStudent extends Student
{
int iterafee =200;
public void display()
{
System.out.println("Student Data");
}
public static void main(String args[])
{
ITStudent i=new ITStudent();
int total=i.iterafee+i.fee;
i.get();
i.display();
System.out.println("fee:"+i.fee);
System.out.println("Itera fee:"+i.iterafee);
System.out.println("Total fee:"+total);

}
}