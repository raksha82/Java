public class SuperMarket{

static String name = "Muthu";
static int no = 40;

SuperMarket(String prodName, int price){
this.prodName=prodName;
this.price=price;
System.out.println("Product:"+prodName);
System.out.println("Price:"+price);
}

String prodName;
int price;

public static void main(String[] args)
{
    
    SuperMarket product1 = new SuperMarket("boost",200);
//    product1.prodName = "boost";
//    product1.price = 200;

    SuperMarket product2 = new SuperMarket("Horlicks",250);
//    product2.prodName = "Horlicks";
//    product2.price = 250;

    product2.buy();
    product1.buy();
  
}

//this refers to current object
public void buy(){
    System.out.println("buy - method");
    System.out.println("ProdName : "+this.prodName);
    System.out.println("Price : "+this.price);
}


}
