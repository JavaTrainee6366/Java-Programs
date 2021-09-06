import java.util.Locale;

public class String_Handling {
	
	public static void main(String[] args) {
		
		String s = "I have a car ,";
		String s2 = " Its color is white";
		String s3 = "i have been in btes since 5 years";
		
	//	StringBuffer sb = new StringBuffer("This is computer");
		
		//System.out.println("Reverse a string Buffer ::");
		//System.out.println(sb.reverse());
		
		System.out.println("");
		
		System.out.println("...."+s3);
		System.out.println("Index of s :: "+s.indexOf('a'));
		
		//System.out.println("Concatination :: "+s3);
		
		String s4 = s.substring(3,9);
		System.out.println("Substring :: "+s4);
		
		String[] srr = s3.split(" ");
		
		System.out.println("");
	
		for(int i=0; i <srr.length ; i++){
			if (srr[i].equals("btes")) {
				System.out.print(" "+srr[i].toUpperCase()+" ");
			}else {
		//System.out.println("Index : "+i+"  Value :: "+srr[i]+" ");
		System.out.print(srr[i].substring(0, 1).toUpperCase()+srr[i].substring(1)+" ");
		}
		}
		
		
		
	/*	System.out.println("");
		System.out.println("toCharArray Usage");
		char[] c = s2.toCharArray();
		
		for(int i=c.length-1; i>=0; i--){
			System.out.println("Index : "+i+"  Value :: "+c[i]+"");
			}*/
	
		//StaticDemo.sum();
	
	}

}
