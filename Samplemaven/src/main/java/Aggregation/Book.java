package Aggregation;

public class Book {
	
	String bname;
	String p;
	Author auth;
	
	public Book(String bname,String p,Author auth)
	{
		this.bname=bname;
		this.p=p;
		this.auth=auth;
	}
public void display()
{
	System.out.println("Bookname is  "+ bname);
	System.out.println("Publication is  "+ p);
	System.out.println("Author is  "+ auth.n);

}

public static void main(String[] arg)
{
	Author b1= new Author("JK Rowling");
	Book b2= new Book("Harry potter","Scholastic",b1);
	b2.display();
}
}
