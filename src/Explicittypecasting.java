
public class Explicittypecasting {
	public static void main(String[] args)
	{   int a=34578;
		byte b;
		b=(byte)a;//conversion is not done by the java complier,data also loss
		System.out.println(b);
	}
}
