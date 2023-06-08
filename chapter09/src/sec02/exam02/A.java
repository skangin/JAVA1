package sec02.exam02;

public class A {
	//인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적필드초기화
	//static B field3 = new B();
	static C field3 = new C();
	
	//정적메소드
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	//바깥쪽 정적 필드나 메소드에서는 객체 생성 없이 접근 가능하지만 안쪽 인스턴스 객체(실제 내용물)는 그렇지 않기 때문
	//또는 멤버 클래스가 인스턴스면 객체생성이 전제 조건인데 바깥 필드나 메소드가 정적이라면 객체생성이 안되어 있을 수 있기 때문에
	class B{}
	static class C{}
}
