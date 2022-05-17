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
		super.input("B");
		System.out.print("B반 사회 :");  soc =sc.nextInt();
		System.out.print("B반 과학 :");  sie =sc.nextInt();
		tot = kor + eng + mat +soc +sie ;
		avg = tot/5;
	}
	void output()
	{
		System.out.println("\nB반 총점:"+tot+" 평균:"+avg);
		
	}

}
