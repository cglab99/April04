package april4;

class A {
	int m;
	private int n;
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}
}

public class CreateObjectAndUsageOfMembers {

	public static void main(String[] args) {
		
		int i = 10;
		System.out.println( i );
		
		String str = new String("�ȳ�");
		System.out.println( str );
		
		A a = new A();
		a.m = 10;
		a.print();
	}
}
