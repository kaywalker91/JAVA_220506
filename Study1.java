package Study0506;
public class Study1 {
	public static void main(String[] args) {		
		My my = new My();
	}
}

class My extends Parent{
	int money = 1000000;
	My()
	{
		System.out.println("내 클래스 My가 생성되었습니다.");		
		System.out.println("내돈체크 : "+this.money);
		System.out.println("내돈체크 : "+test);
		System.out.println("내돈체크 : "+super.money);
		
	}
}
class Parent{
	int money = 20000000;
	int test = 20000;
	Parent()
	{
		System.out.println("부모클래스 Parent가 생성되었습니다.");
	}
}
