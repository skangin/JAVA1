package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent p1 = child;
		
		p1.method1();
		p1.method2(); // Override된 Child쪽 method2가 우선 호출됨
		//p1.method3(); p1은 Parent로 타입변환 되어 Child의 method 사용 x
	}

}
