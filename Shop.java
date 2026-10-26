class ShopDetails
{
static String name="Flipkart";
static int age=30;

public static void main (String[] args)
{

System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Address:"+Shop.address);
}


}

class Shop
{
static String address="Chennai";
public static void main (String[] args)
{

System.out.println("Name:"+ShopDetails.name);

System.out.println("Address:"+address);

System.out.println("Age:"+ShopDetails.age);
}
}
