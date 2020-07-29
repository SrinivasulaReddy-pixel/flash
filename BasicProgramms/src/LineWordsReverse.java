
public class LineWordsReverse {

	public static void main(String[] args) {
		String str = "I am a good boy";
		String [] str1 = str.split("\\s");
        for(int i=str1.length-1;i>=0;i--)
        {
        	if(i==0)
        	System.out.print(str1[i]);
        	else
        		System.out.print(str1[i]+",");
        }
	}
}
