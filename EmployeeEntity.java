public class EmployeeEntity
{
//EmployeeEntity employee = new EmployeeEntity(1,"ab","testing",17000);

    private int id;
    private String name;
    private String dept;
    private int salary;

public EmployeeEntity(int id,String name,String dept,int salary){
    this.id = id;
    this.name = name;
    this.dept = dept;
    this.salary = salary;
}

public int getId(){
    return this.id;
}

public void setId(int id){
    this.id = id;
}

public String getName(){
    return this.name;
}

public void setName(String name){
    this.name = name;
}

public String getDept(){
    return this.dept;
}

public void setDept(String dept){
    this.dept = dept;
}

public int getSalary(){
    return this.salary;
}

public void setSalary(int salary){
    this.salary = salary;
}

public String toString(){
    return "{"+id+" - "+name+" - "+dept+" - "+salary+"}";
}



}
