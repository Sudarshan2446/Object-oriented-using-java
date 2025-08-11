//Inheritance
class Employee
{
int Salary=91000;
public void get()
{
System.out.println("Employee Salary");
}
}
public class Programmer extends Employee
{
int bonus=5000;
public void display()
{

System.out.println("Programmer Bonus:"+bonus);
}
public static void main(String args[])
{
Programmer i=new Programmer();
int total=i.bonus+i.Salary;
i.get();
System.out.println("Salary:"+i.Salary);
i.display();
System.out.println("Total:"+total);


}
}