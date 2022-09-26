package javademos;

public class stringsDemo {

	public static void main(String[] args) {
		String text = "Weather is so good.";
		
		System.out.println(text);
		System.out.println("Number of elements :" + text.length());
		System.out.println("5th element : " + text.charAt(4));
		System.out.println(text.concat(" Yaaay!"));
		System.out.println(text.startsWith("W"));
		System.out.println(text.endsWith("."));
		char[] chars = new char[7];
		text.getChars(0, 7, chars, 0);
		System.out.println(chars);
		System.out.println(text.indexOf('o'));
		System.out.println(text.lastIndexOf('o'));
		
		String newText = text.replace(' ','-');
		System.out.println(newText);
		System.out.println(text.substring(2));
		System.out.println(text.substring(2, 5));
		
		for (String word : text.split(" ")) {
			System.out.println(word);
			
		}
		
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		
		System.out.println(text.trim());
		
		
	}

}
