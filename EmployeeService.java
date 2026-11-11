import java.util.*;



class EmployeeService
{


ArrayList<EmployeeManagementSystem>  list = new ArrayList<>();

public  void addEmployee(EmployeeManagementSystem employee)
{

   list.add(employee);
   System.out.println("New employee Added");
}

public void deleteEmployee(int id)
{
   for(int i=0;i<list.size();i++)
   {
      if(list.get(i).getId()==id) 
      {
         list.remove(i);
         System.out.println("Removed");
         return;
      }
   }

   System.out.println("Not Found");
 
}

public void getEmployee()
{
System.out.println(list);
}



public static void main (String[] args)
{

 EmployeeManagementSystem emp1 = new EmployeeManagementSystem(1 , "Raksha" , 15000 , "Tester");
 EmployeeManagementSystem emp2 = new EmployeeManagementSystem(2 , "Ranjan" , 25000 , "Developer");
 

 
 EmployeeService e=new EmployeeService();
 e.addEmployee(emp1);
 e.addEmployee(emp2);
 e.getEmployee();
 e.deleteEmployee(1);
 e.getEmployee();
}

}