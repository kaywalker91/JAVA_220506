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
			System.out.println("1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("선택:");  select =sc.nextInt();
			
			if(select == 1) 	 {input();}
			else if(select == 2) {output();}
			else if(select == 3) {break;}		
		}
		System.out.println("\\n프로그램 종료.");
	}
	void input()
	{
		System.out.print("A반 국어 :");  kor =sc.nextInt();
		System.out.print("A반 영어 :");  eng =sc.nextInt();
		System.out.print("A반 수학 :");  mat =sc.nextInt();
		tot = kor + eng + mat;
		avg = tot/3;
	}
	void output()
	{
		System.out.println("\n\"A반 총점:"+tot+" 평균:"+avg);
		
	}
	void input(String ban)
	{
		System.out.print(ban+"반 국어 :");  kor =sc.nextInt();
		System.out.print(ban+"반 영어 :");  eng =sc.nextInt();
		System.out.print(ban+"반 수학 :");  mat =sc.nextInt();
		tot = kor + eng + mat;
		avg = tot/3;
	}
	void output(String ban)
	{
		System.out.println("\n"+ban+"반 총점:"+tot+" 평균:"+avg);
		
	}

}
