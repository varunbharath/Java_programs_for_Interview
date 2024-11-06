package interview;

import java.util.Iterator;

public class Dublicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,67,97,43,974,5421,89065,2,67,97};
		for(int i=0; i<arr.length;i++) {
			for(int j=1;j<arr.length;j++)
		{
				if(arr[i]==arr[j]) {
					System.out.println(" dublicate"+arr[i]);
				}
		}
			
		}

	}

}
