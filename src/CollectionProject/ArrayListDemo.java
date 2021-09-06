package CollectionProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
	
		ArrayList<String> list1 = new ArrayList<String>();
		
		HashSet<String> hs = new HashSet<String>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "ABC");
		hm.put(2,"XYZ");
	
		
		for(Entry<Integer, String> entry: hm.entrySet()) {
			
			System.out.println(entry.getValue());
			
		}
		
	/*	hs.add("Anupam");
		hs.add("Anupam");
		hs.add("Deepika");
		
*/		list.add("Java");
		list.add("Java");
		list.add("PHP");
		
		list1.add("Amrit");
		list1.add("Deepika");
		list1.add("Yatin");
		
		list.addAll(list1);
		//list.remove(4);
		
		
		hs.addAll(list);
	/*	Collections.sort(list);
		for (String element : list) {
			System.out.println(element);
		}*/
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		/*Collections.sort(list);
		
		for(String al : hs)
		{
			System.out.println(al);
		}
			for(int i = 0; i<list.size(); i++)
		{
			System.out.println("Values :: "+list.get(i));
		}
		*/
		
		
	}

}
