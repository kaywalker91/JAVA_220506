package Study0506;

import java.util.Scanner;

public class Aban11 
{
	Scanner sc = new Scanner(System.in);
	int kor, eng, mat, tot, avg;
	int select;
	
	void menu()
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
		System.out.print("A�� ���� :");  kor =sc.nextInt();
		System.out.print("A�� ���� :");  eng =sc.nextInt();
		System.out.print("A�� ���� :");  mat =sc.nextInt();
		tot = kor + eng + mat;
		avg = tot/3;
	}
	void output()
	{
		System.out.println("\n\"A�� ����:"+tot+" ���:"+avg);
		
	}
	void input(String ban)
	{
		System.out.print(ban+"�� ���� :");  kor =sc.nextInt();
		System.out.print(ban+"�� ���� :");  eng =sc.nextInt();
		System.out.print(ban+"�� ���� :");  mat =sc.nextInt();
		tot = kor + eng + mat;
		avg = tot/3;
	}
	void output(String ban)
	{
		System.out.println("\n"+ban+"�� ����:"+tot+" ���:"+avg);
		
	}

}
