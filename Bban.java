package Study0506;

import java.util.Scanner;

public class Bban extends Aban11{
	Scanner sc = new Scanner(System.in);
	int soc, sie, tot, avg;
	int select;
	Bban()
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
		super.input("B");
		System.out.print("B�� ��ȸ :");  soc =sc.nextInt();
		System.out.print("B�� ���� :");  sie =sc.nextInt();
		tot = kor + eng + mat +soc +sie ;
		avg = tot/5;
	}
	void output()
	{
		System.out.println("\nB�� ����:"+tot+" ���:"+avg);
		
	}

}
