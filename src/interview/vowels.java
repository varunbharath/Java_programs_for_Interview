package interview;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="wertyuiowertyuiwertyu";
		int number=0;
		for (int i=0; i<name.length();i++) {
			char ch=name.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				number++;
				System.out.print(ch);
				break;
			}
			System.out.print(number);
			
		}

	}

}
