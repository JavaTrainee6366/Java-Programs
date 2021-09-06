package StringProgram;

public class StringReverse {

	public static void main(String[] args) {
		String a="";
		String s="City Chandigarh is Beautiful";
		String s1=new String("CITY CHNDIGARH IS BEAUTIFUL");
		for(int i=s.length()-1;i>=0;i--)
		{
			a=a+s.charAt(i);
		}
System.out.println(a);


	}

}
