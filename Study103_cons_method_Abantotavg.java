package Study0506;

import java.util.Scanner;

public class Study103_cons_method_Abantotavg 
{

	public static void main(String[] args) 
	{
		Bban11 b = new Bban11();
	}

}

class Aban
{
	Scanner sc = new Scanner(System.in);
	
	int kor, eng, mat;
	int tot;
	int avg;
	int sel;
	
	Aban()
	{
		while(true)
		{
			main();
			
			if(sel == 1)
			{
				in();
			}
			else if(sel == 2)
			{
				out();
			}
			else if(sel == 3)
			{
				System.out.println("���α׷� ����.");
				break;	
			}
		}
	}
	
	void main()
	{
		System.out.println("1.�����Է�");
		System.out.println("2.��������");
		System.out.println("3.����");
		System.out.print("����:");
		sel = sc.nextInt();
		System.out.println();	
	}
	
	void in()
	{
		System.out.print("A�� ����: ");
		kor = sc.nextInt();
		System.out.print("A�� ����: ");
		eng = sc.nextInt();
		System.out.print("A�� ����: ");
		mat = sc.nextInt();
		System.out.println();
		tot = kor+eng+mat;
		avg = tot/3;
	}
	
	void out()
	{
		System.out.println("A�� ����: "+tot +" ���: "+avg);
		System.out.println();
		
	}
}

class Bban11 extends Aban
{
	int subNum = 5;
	int soc, sie;
	
	Bban11()
	{
		while(true)
		{
			main();
			
			if(sel == 1)
			{
				in();
			}
			else if(sel == 2)
			{
				out();
			}
			else if(sel == 3)
			{
				System.out.println("���α׷� ����.");
				System.out.println();
				break;	
			}
		}
	}
	
	void main()
	{
		System.out.println("1.�����Է�");
		System.out.println("2.��������");
		System.out.println("3.����");
		System.out.print("����:");
		sel = sc.nextInt();
		System.out.println();	
	}
	
	void in()
	{
		System.out.print("B�� ����: ");
		kor = sc.nextInt();
		System.out.print("B�� ����: ");
		eng = sc.nextInt();
		System.out.print("B�� ����: ");
		mat = sc.nextInt();
		System.out.print("B�� ��ȸ: ");
		soc = sc.nextInt();
		System.out.print("B�� ����: ");
		sie = sc.nextInt();
		System.out.println();
		
		tot = kor+eng+mat+soc+sie;
		avg = tot/subNum;
	}
	
	void out()
	{
		System.out.println("B�� ����: "+tot +" ���: "+avg);
		System.out.println();
	}
}

class Cban11
{
	Scanner sc = new Scanner(System.in);
	
	int subNum = 5;
	int kor, eng, mat;
	int music, art;
	int tot;
	int avg;
	int sel;
	
	Cban11()
	{
		while(true)
		{
			main();
			
			if(sel == 1)
			{
				in();
			}
			else if(sel == 2)
			{
				out();
			}
			else if(sel == 3)
			{
				System.out.println("���α׷� ����.");
				break;	
			}
		}
	}
	
	void main()
	{
		System.out.println("1.�����Է�");
		System.out.println("2.��������");
		System.out.println("3.����");
		System.out.print("����:");
		sel = sc.nextInt();
		System.out.println();	
	}
	
	void in()
	{
		System.out.print("C�� ����: ");
		kor = sc.nextInt();
		System.out.print("C�� ����: ");
		eng = sc.nextInt();
		System.out.print("C�� ����: ");
		mat = sc.nextInt();
		System.out.print("C�� ����: ");
		music = sc.nextInt();
		System.out.print("C�� �̼�: ");
		art = sc.nextInt();
		System.out.println();
		tot = kor+eng+mat+music+art;
		avg = tot/subNum;
	}
	
	void out()
	{
		System.out.println("C�� ����: "+tot +" ���: "+avg);
		System.out.println();
	}
}
