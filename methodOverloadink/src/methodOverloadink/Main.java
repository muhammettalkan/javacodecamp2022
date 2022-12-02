package methodOverloadink;

public class Main {

	public static void main(String[] args) {
		FourOperators fourOperators = new FourOperators();
		System.out.println(fourOperators.add(2, 3));
		fourOperators.add(5, 6, 7);
	}

}
