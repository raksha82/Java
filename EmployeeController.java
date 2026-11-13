import java.io.File;
import java.io.IOException;
public class EmployeeController
{


public static void main(String[] args)
{

       File file = new File("D:/Java Full Stack Payilagam/Java");

       String[] files =  file.list((dir, name) -> name.endsWith(".java"));
       for(int i=0;i<files.length;i++){
            System.out.println(files[i]);
        }    


     File dir = new File("D:/Java Full Stack Payilagam/Java");

        File[] folders = dir.listFiles(File::isDirectory);

        if (folders != null) {
            for (File folder : folders) {
                System.out.println(folder.getName());
            }
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
