package sec01.exam01;

class Number{
	static int num = 0;//스태틱필드
	int num2 = 0; //인스턴스필드
}

public class StaticExample {

	public static void main(String[] args) {
		Number number1 = new Number();
		Number number2 = new Number();
		
		number1.num++;
		number1.num2++;
		System.out.println(number2.num);
		System.out.println(number2.num2);

	}

}
