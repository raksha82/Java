import java.util.*;



class EmployeeService
{


ArrayList list = new ArrayList();

public  void addEmployee(EmployeeManagementSystem employee)
{
   list.add(employee);
   System.out.println("New employee Added");
   System.out.println(Arrays.toString(a.toArray()));
}



public static void main (String[] args)
{

 EmployeeManagementSystem emp = new EmployeeManagementSystem(1 , "Raksha" , 15000 , "Tester");
 
 EmployeeService e=new EmployeeService();
 e.addEmployee(emp);
}

}