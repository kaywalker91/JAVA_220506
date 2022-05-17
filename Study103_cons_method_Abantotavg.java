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
				System.out.println("프로그램 종료.");
				break;	
			}
		}
	}
	
	void main()
	{
		System.out.println("1.점수입력");
		System.out.println("2.점수보기");
		System.out.println("3.종료");
		System.out.print("선택:");
		sel = sc.nextInt();
		System.out.println();	
	}
	
	void in()
	{
		System.out.print("A반 국어: ");
		kor = sc.nextInt();
		System.out.print("A반 영어: ");
		eng = sc.nextInt();
		System.out.print("A반 수학: ");
		mat = sc.nextInt();
		System.out.println();
		tot = kor+eng+mat;
		avg = tot/3;
	}
	
	void out()
	{
		System.out.println("A반 총점: "+tot +" 평균: "+avg);
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
				System.out.println("프로그램 종료.");
				System.out.println();
				break;	
			}
		}
	}
	
	void main()
	{
		System.out.println("1.점수입력");
		System.out.println("2.점수보기");
		System.out.println("3.종료");
		System.out.print("선택:");
		sel = sc.nextInt();
		System.out.println();	
	}
	
	void in()
	{
		System.out.print("B반 국어: ");
		kor = sc.nextInt();
		System.out.print("B반 영어: ");
		eng = sc.nextInt();
		System.out.print("B반 수학: ");
		mat = sc.nextInt();
		System.out.print("B반 사회: ");
		soc = sc.nextInt();
		System.out.print("B반 과학: ");
		sie = sc.nextInt();
		System.out.println();
		
		tot = kor+eng+mat+soc+sie;
		avg = tot/subNum;
	}
	
	void out()
	{
		System.out.println("B반 총점: "+tot +" 평균: "+avg);
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
				System.out.println("프로그램 종료.");
				break;	
			}
		}
	}
	
	void main()
	{
		System.out.println("1.점수입력");
		System.out.println("2.점수보기");
		System.out.println("3.종료");
		System.out.print("선택:");
		sel = sc.nextInt();
		System.out.println();	
	}
	
	void in()
	{
		System.out.print("C반 국어: ");
		kor = sc.nextInt();
		System.out.print("C반 영어: ");
		eng = sc.nextInt();
		System.out.print("C반 수학: ");
		mat = sc.nextInt();
		System.out.print("C반 음악: ");
		music = sc.nextInt();
		System.out.print("C반 미술: ");
		art = sc.nextInt();
		System.out.println();
		tot = kor+eng+mat+music+art;
		avg = tot/subNum;
	}
	
	void out()
	{
		System.out.println("C반 총점: "+tot +" 평균: "+avg);
		System.out.println();
	}
}
