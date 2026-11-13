import java.util.ArrayList;
public class EmployeeService
{

ArrayList<EmployeeEntity> list = new ArrayList();

//Add new Employee
public boolean addEmployee(EmployeeEntity employee){ 
    boolean isAdded = list.add(employee);
    return isAdded;
}

//View All Employee
public void viewEmployee(){
    System.out.println(list);
}

//Get Employee by ID
public EmployeeEntity viewEmployee(int id){

    for(int i = 0;i < list.size(); i++)
    {
     if(list.get(i).getId() == id){
        return list.get(i);
        }   
    }
    return null;  
}

//Get Employee by Name
public ArrayList<EmployeeEntity> viewEmployeeByName(String name){
//        empentityobj.getName()
//        StringObj.equals(StringObj);

    ArrayList<EmployeeEntity> al = new ArrayList();
    for(int i = 0;i < list.size();i++){
        if(list.get(i).getName().equals(name)) {
              al.add(list.get(i));
        }
    }
    return al;
}

//Remove employee task

//Update employee
public void updateEmployee(EmployeeEntity employee){
    for(EmployeeEntity emp : list){
        if(emp.getId() == employee.getId()){
            emp.setName(employee.getName());
            emp.setDept(employee.getDept());
            emp.setSalary(employee.getSalary());
        }
    }
}




                  



}
