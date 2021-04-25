
/**
 * Write a description of class Employee1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Employee1
{
  String employee_Id;
  String name;
  String department;
  String address;
  String company;
  double salary;
  Employee1 (String employee_Id, String name, String department, String address, String company, double salary)
  {
      this.employee_Id=employee_Id;
      this.name=name;
      this.department=department;
      this.address=address;
      this.company=company;
      this.salary=salary;
  }   
  public static void main (String arg[] )  
  {
      Employee1 emp= new Employee1( "1074599", "Deb", "IT Admin", "Hooghly", "TCS", 50000.98999 );
      Employee1 emp1= new Employee1( "107", "Test", "IT Admin", "Hooghly", "TCS", 70000.55 );
      System.out.println ("------------------------------------------------------------------------------------------------------------");
      System.out.printf ("%5s %10s %10s %10s %10s %10s", "Employee ID", "Name", "Department", "Address", "Company", "Salary" ); 
      System.out.println();
      System.out.println ("--------------------------------------------------------------------------------------------------------");     
      System.out.format("%10s %10s %10s %10s %10s %10.2f",
                emp.employee_Id, emp.name, emp.department, emp.address, emp.company, emp.salary); 
        System.out.println();
        System.out.format("%10s %10s %10s %10s %10s %10.2f",
                emp1.employee_Id, emp1.name, emp1.department, emp1.address, emp1.company, emp1.salary); 
                System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
    
} 
       
