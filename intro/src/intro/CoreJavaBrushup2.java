package intro;

import java.util.ArrayList;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {12,21,32,44,53};
		
		for (int i=0; i<arr2.length;i++)
		{
			 if(arr2[i] % 2 == 0)
			 {
				 System.out.println(arr2[i]);
				 break;
			 }
			 else
			 {
				 System.out.println(arr2[i] + " It's not a multiple of 2");
			 }
		}
		// create object of the class - object.method
		ArrayList<String> a = new ArrayList<String>();
		a.add("Raul");
		a.add("Zimrri");
		a.add("Sam");
		a.add("Bernice");
		//a.remove(4);
		System.out.println(a.get(2));
		
		for(int i =0; i<a.size();i++)
		{
			System.out.println(a.get(i)); 
		}
		for( String val :a)
		{
			System.out.println(val); 
		}
		//Check if string present in array 
		System.out.println(a.contains("Zimrri"));
		
		
		
	}

}
