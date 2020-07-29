import java.util.Scanner;
public class StringReverse {
	//@SuppressWarnings("resource")
	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		char [] carray = str.toCharArray();
		for(int i=carray.length-1;i>=0;i--)
		{
			if(i==0)
				System.out.print(carray[i]);
			else
				System.out.print(carray[i]+",");
		}
		
		System.out.println("\n");		
		String rc = recursive("amma");
		System.out.println(rc);
	}
	public static String recursive(String str)
	{
		if(str.length()<2)
		{
			return str;
		}
		return recursive(str.substring(1)) + str.charAt(0);
	}

}
