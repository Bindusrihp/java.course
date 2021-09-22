class Cycle{
String brand;
String color;
int noOfWheel;
void fast()
{
System.out.println(color+" "+brand+" is fast ...!");
}
void slow()
{
System.out.println(color+" "+brand+" is slow...!");
}
public static void main(String[] args)
{
Cycle hero = new Cycle();
hero.brand = "Hero";
hero.color = "Black";
hero.noOfWheel = 2;

hero.fast();
hero.slow();
}

}