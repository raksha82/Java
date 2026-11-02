class EmployeeManagementSystem
{

private int e_id;
private String e_name;
private double e_salary;
private String e_dept;


public int getId()
{
return this.e_id;
}

public void setId(int id)
{
this.e_id=id;
}


public String getName()
{
return this.e_name;
}

public void setName(String name)
{
this.e_name=name;
}

public double getSalary()
{
   return this.e_salary;
}

public void setSalary(double salary)
{
    this.e_salary=salary;
}


public String getDept()
{
     return this.e_dept; 
}


public void setDept(String dept)
{
this.e_dept=dept;
}


public EmployeeManagementSystem(int e_id , String e_name , double e_salary , String e_dept)
{

this.e_id = e_id;
this.e_name=e_name;
this.e_salary=e_salary;
this.e_dept=e_dept;


/*System.out.println("Id:"+e_id);
System.out.println("Name:"+e_name);
System.out.println("Salary:"+e_salary);
System.out.println("Dept:"+e_dept);
*/


}


public static void main (String[] args)
{
       


}




}