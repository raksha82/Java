class Shop
{
String name;
void hello()
{
System.out.println("Hello , Welcome to Shop " +name);

}

}

class Objects 
{
public static void main (String[] args)
{
   Shop p=new Shop();
   p.name="Raksha";
   p.hello();

   Shop q=new Shop();
   q.name="Ranjan";
   q.hello();
}
}