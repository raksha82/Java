class Birds
{
static String name="Parrot";
static String home="Trees";

public static void printing()
{
System.out.println("Bird name:"+name+"\nBird's Home:"+home);
}

public static void main (String[] args)
{
   System.out.println(Birds.name);
   System.out.println(Birds.home);
   Birds.printing();
}
}