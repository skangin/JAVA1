package sec04.exam02;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국"); // 1)
		System.out.println("Parent() call");  // 2)
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
