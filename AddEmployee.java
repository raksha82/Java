import java.util.*;



class EmployeeService
{

ArrayList<EmployeeManagementSystem> a = new ArrayList<>();

public void addEmployee(EmployeeManagementSystem employee)
{
   a.add(employee);
   System.out.println("New employee Added");
   System.out.println(Arrays.toString(a.toArray()));
}



public static void main (String[] args)
{

 EmployeeManagementSystem emp = new EmployeeManagementSystem(1 , "Raksha" , 15000 , "Tester");
 EmployeeService e1=new EmployeeService();
 e1.addEmployee(emp);

}

}