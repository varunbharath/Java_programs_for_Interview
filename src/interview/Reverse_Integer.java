package interview;

public class Reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=1234567890;
		while(number!=0) {
			
			int numberstored=number%10;
			System.out.print(numberstored);
			number=number/10;
		}

	}

}
