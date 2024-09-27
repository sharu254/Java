package AccessModifier1;

 public class Sample
 {
protected String name= "Sharu";
protected void method()
{
	System.out.println("Method1");
}
public static void main( String[] args)
{
	Sample obj= new Sample();
	System.out.println(obj.name);
			
			obj.method();
}
}

