package Study0506;

import java.util.Scanner;

public class Study2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		int select;
		
		while(true)
		{
			System.out.println("1.A������ó��");
			System.out.println("2.B������ó��");
			System.out.println("3.C������ó��");
			System.out.println("4.����");
			System.out.print("����:");  select =sc.nextInt();
			
			if(select == 1) 	 { Aban11  a = new Aban11();   a.menu();}
			else if(select == 2) { Bban b = new Bban();}
			else if(select == 3) { Cban c  = new Cban();}	
			else if(select == 4) { break;}	
		}
		System.out.println("\n���α׷� ����.");	
	}

}
