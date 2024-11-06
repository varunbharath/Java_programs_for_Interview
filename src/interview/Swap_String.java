package interview;

public class Swap_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="bharath";
		String name2="varun";
		
		System.out.println( "Before Swap"  +name + name2);
		String s=name+name2;
		
		name2=s.substring(0 ,name.length());
		name=s.substring( name2.length());
		System.out.println("After Swap"+ name + name2);


	}

}
