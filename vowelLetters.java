package javademos;

public class vovelLetters {

	public static void main(String[] args) {
		char letter = 'A';
		
		switch (letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It's a bold Turkish vowel");
			break;

		default: System.out.println("It's not a bold Turkish vowel");
			break;
		}

	}

}
