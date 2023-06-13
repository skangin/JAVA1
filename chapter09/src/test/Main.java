package test;

public class Main {

	public static void main(String[] args) {
		Button b = new Button();
		b.setOnClickListener(new Call());
		b.touch();
		b.setOnClickListener(new Message());
		b.touch();

	}

}
