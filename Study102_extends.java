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
		System.out.println("�� Ŭ���� My�� �����Ǿ����ϴ�.");
		System.out.println("����üũ:" + this.mn);
		System.out.println("testüũ:" +test);
		System.out.println("����üũ:" +super.mn);
	}
}

class Parent1
{
	int mn = 2000;
	int test = 500;
	
	Parent1()
	{
		System.out.println("�θ� Ŭ���� Parent�� �����Ǿ����ϴ�.");
	}
		
}
