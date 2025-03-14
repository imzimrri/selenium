package intro;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = 5;
		String website = "Zimrri Gudino";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum + " is the value stored in the myNum variable");
		
		// Arrays 
		int[] arr = new int[5];
		arr[0] = 1; 
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {12,21,32,44,53};
		
		System.out.println(arr[0]);
		
		//for loop 
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"Zimrri", "Shady", "Nico"};
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for( String s: name)
		{
			System.out.println(s);
		}
		
	}

}
