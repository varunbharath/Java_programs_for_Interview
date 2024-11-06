package interview;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="Bharath";
		String word2="";
		for(int i=word.length()-1;i >=0;i--)
		{
			String ch=word2+word.charAt(i);
			System.out.print(ch);
		}
		if(word.equals(word2)) {
			System.out.println("Sreing is Palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
	}

}
