class LogicalOperatorDemo{
public static void main(String[] args)
{
int p = 100 ;
int q = 200 ;
System.out.println( "Logical AND operator");
System.out.println( p>q && ++p<q);

System.out.println( "Logical OR operator");
System.out.println( p>q || ++p<q);

System.out.println( "Logical NOT operator");
System.out.println( !(p>q));

}

}