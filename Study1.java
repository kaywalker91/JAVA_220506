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
		System.out.println("�� Ŭ���� My�� �����Ǿ����ϴ�.");		
		System.out.println("����üũ : "+this.money);
		System.out.println("����üũ : "+test);
		System.out.println("����üũ : "+super.money);
		
	}
}
class Parent{
	int money = 20000000;
	int test = 20000;
	Parent()
	{
		System.out.println("�θ�Ŭ���� Parent�� �����Ǿ����ϴ�.");
	}
}
