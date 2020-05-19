package StartJava;

import java.util.Arrays;

public class ArrayPrgm {

	public static void main(String[] args) {
		// only store similar type data type
		// Size is fixed;
	 int[] a = new int [3];
	 a[0]= 1;
	 a[1]= 2;
	 a[2]= 3;
	 
	 int b[] = {10,11,12};
		System.out.println(a.length);//Array length
		System.out.println(a.length-1); //Array Index length
		System.out.println(a[0]); // 
		System.out.println(a[1]); // 
		System.out.println(a[2]); // 
		// Print the Array
		for (int i =0; i <= a.length-1; i++) {
			
		System.out.print(a[i]);
			
		}	
		System.out.print("-----------------");
		
	for (int i : b) {
		
		System.out.println(i);  
	}
	
// Compare same Array
	
	int c[] = {1,2,3};
	int d[] = {1,2,3};
	
	if (Arrays.equals(c, d)) {
	 System.out.println("array is same");  
	}
	
	else {
		
		System.out.println("Not same");
	}
	
	}
}
