package interview;

public class Fibino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<5;i++) {
			num=a+b;
			a=b;
			b=num;
			System.out.println(num);
		}

	}

}
