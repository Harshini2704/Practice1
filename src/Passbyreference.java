
public class Passbyreference {
	String name;
	int cost;
	int seats;
}
 class demo{
public static void main(String[] args)
{
Passbyreference a=new Passbyreference();
a.name="priya";
a.cost=20;
a.seats=60;
System.out.print(a.name);
System.out.print(a.cost);
System.out.print(a.seats);
Passbyreference b;
b=a;
b.name="riya";
b.cost=200;
b.seats=70;
System.out.print(b.name);
System.out.print(b.cost);
System.out.print(b.seats);
}
}
