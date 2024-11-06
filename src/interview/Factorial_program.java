package interview;

public class Factorial_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
	int fact	=num;
	// Calculate factorial using a while loop
while(num>1) {
	num --; // Decrease num by 1
	fact *=num; // Multiply fact by num
	
}
System.out.println(fact);
	}

}
