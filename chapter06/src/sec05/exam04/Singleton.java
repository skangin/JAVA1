package sec05.exam04;

public class Singleton {
	// 정적 필드(객체 생성을 통해서 생성한..)
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	//메소드	
	static Singleton getInstance() {
		return singleton;
	}
}
