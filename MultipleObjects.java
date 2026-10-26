class MultipleObjects{
int age;
String name;
int hello;

MultipleObjects(int age,String name)
{
this.age=age;
this.name=name;
}

public static void main(String[] args)
{

MultipleObjects o=new MultipleObjects(21,"Raksha");
System.out.println(o.age);
System.out.println(o.name);
System.out.println(o.hello);
}
}