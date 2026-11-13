import java.io.File;
import java.io.IOException;
public class EmployeeController
{


public static void main(String[] args)
{

    File file = new File("/home/vijay/Documents/prp6/html_css/java-project/ems");

       String[] files =  file.list();
       for(int i=0;i<files.length;i++){
            System.out.println(files[i]);
        }        
   

    
    
    









    EmployeeEntity employee1 = new EmployeeEntity(1,"Rakesh","testing",15000);
    EmployeeEntity employee2 = new EmployeeEntity(2,"Niju","develop",25000);
    
    EmployeeService service = new EmployeeService();
    service.addEmployee(employee1);
    service.addEmployee(employee2);
//    
//    service.viewEmployee();
//    EmployeeEntity emp = service.viewEmployee(2);
//    System.out.println(emp);
//    EmployeeEntity updateEmp = new EmployeeEntity(2,"Niju","develop",30000);
    service.viewEmployee();
    service.updateEmployee(new EmployeeEntity(2,"Niju","develop",30000));
    service.viewEmployee();

   
}



}
