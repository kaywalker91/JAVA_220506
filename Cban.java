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
		System.out.print("C반 국어 :");  kor =sc.nextInt();
		System.out.print("C반 영어 :");  eng =sc.nextInt();
		System.out.print("C반 수학 :");  mat =sc.nextInt();
		System.out.print("C반 음악 :");  mus =sc.nextInt();
		System.out.print("C반 미술 :");  art =sc.nextInt();
		tot = super.kor + super.eng + super.mat +mus +art ;
		avg = tot/5;
	}
	void output()
	{
		System.out.println("\nC반 총점:"+tot+" 평균:"+avg);
		
	}

}
