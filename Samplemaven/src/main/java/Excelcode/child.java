package Excelcode;

import java.io.IOException;

public class child 
{
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String s1=Excelread.readStringData(0,0);
		System.out.println(s1);
		
		String s2= Excelread.readIntegerData(1,1);
		System.out.println(s2);
	}

}
