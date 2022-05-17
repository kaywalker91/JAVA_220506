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
			System.out.println("1.A반점수처리");
			System.out.println("2.B반점수처리");
			System.out.println("3.C반점수처리");
			System.out.println("4.종료");
			System.out.print("선택:");  select =sc.nextInt();
			
			if(select == 1) 	 { Aban11  a = new Aban11();   a.menu();}
			else if(select == 2) { Bban b = new Bban();}
			else if(select == 3) { Cban c  = new Cban();}	
			else if(select == 4) { break;}	
		}
		System.out.println("\n프로그램 종료.");	
	}

}
