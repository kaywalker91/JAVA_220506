package Study0506;

public class Study102_extends 
{
	public static void main(String[] args) 
	{
		My1 my = new My1();
	}
}

class My1 extends Parent1
{
	int mn = 1000;
	
	My1()
	{
		System.out.println("내 클래스 My가 생성되었습니다.");
		System.out.println("내돈체크:" + this.mn);
		System.out.println("test체크:" +test);
		System.out.println("내돈체크:" +super.mn);
	}
}

class Parent1
{
	int mn = 2000;
	int test = 500;
	
	Parent1()
	{
		System.out.println("부모 클래스 Parent가 생성되었습니다.");
	}
		
}
