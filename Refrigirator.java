class Refrigirator{
String brand;
String color;
String star;
void fivestar()
{
System.out.println(color+" "+brand+" is five star ...!");
}
void threestar()
{
System.out.println(color+" "+brand+" is three star...!");
}
public static void main(String[] args)
{
Refrigirator lg = new Refrigirator();
lg.brand = "LG";
lg.color = "Black";
lg.star = "star";

lg.fivestar();
lg.threestar();
}

}