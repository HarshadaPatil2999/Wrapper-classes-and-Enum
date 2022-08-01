package demo;

public class Example3 {
	public static void main(String[] args) {
		
		System.out.println(Character.isDigit('0'));
		System.out.println(Character.isLetter('s'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('a'));
		//System.out.println(Character.isJavaLetter('_'));
		System.out.println(Character.isJavaIdentifierPart('_'));
		System.out.println(Character.isJavaIdentifierPart('#'));
		System.out.println(Character.compare('a', 'a'));
	}

}
