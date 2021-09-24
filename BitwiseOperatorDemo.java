class BitwiseOperatorDemo{
public static void main(String[] args)
{
int p = 100 ;
int q = 200 ;
System.out.println( "Bitwise AND operator");
System.out.println( p>q & ++p<q);

System.out.println( "Bitwise OR operator");
System.out.println( p>q | ++p<q);

System.out.println( "Bitwise XOR operator");
System.out.println(p>q ^ ++p<q );

}

}