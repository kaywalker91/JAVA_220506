package Study0506;

import java.util.Scanner;

public class Cban extends Aban
{
	Scanner sc = new Scanner(System.in);
	int mus, art, tot, avg;
	int select;
	
	Cban()
	{
		while(true)
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����:");  select =sc.nextInt();
			
			if(select == 1) 	 {input();}
			else if(select == 2) {output();}
			else if(select == 3) {break;}		
		}
		System.out.println("\\n���α׷� ����.");
	}
	void input()
	{
		System.out.print("C�� ���� :");  kor =sc.nextInt();
		System.out.print("C�� ���� :");  eng =sc.nextInt();
		System.out.print("C�� ���� :");  mat =sc.nextInt();
		System.out.print("C�� ���� :");  mus =sc.nextInt();
		System.out.print("C�� �̼� :");  art =sc.nextInt();
		tot = super.kor + super.eng + super.mat +mus +art ;
		avg = tot/5;
	}
	void output()
	{
		System.out.println("\nC�� ����:"+tot+" ���:"+avg);
		
	}

}
