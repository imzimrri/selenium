package intro;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String is an object
		String s = "Zimrri";
		// String s1 = "Zimrri";
		
		// new 
		// String s2 = new String("Welcome");
		
		String s3 = "Zimrri Izbai Gudino";
		String[] splittedString = s3.split("Izbai");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i = s3.length()-1; i>=0; i--)
		{
			System.out.println(s3.charAt(i));
		}
		
		
	}

}
