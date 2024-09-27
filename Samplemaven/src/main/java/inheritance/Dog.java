package inheritance;

import java.util.Scanner;

	
	
	class Dog extends Animal
	{
		void display()
		{
		System.out.println("My Name is  "  +name);
		}
		public static void main (String[] args)
		
		{
			Scanner s= new Scanner(System.in);
			Dog d= new Dog();
			d.display();
			d.eat();
			
		}
	
	}

