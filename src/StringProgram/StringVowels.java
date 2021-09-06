package StringProgram;

public class StringVowels {

	public static void main(String[] args) {
		int count=0;
		String s="City Chandigarh is Beautiful";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("vowels are"+" "+count);

	}

}
