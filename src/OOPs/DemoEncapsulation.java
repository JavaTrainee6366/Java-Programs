package OOPs;

public class DemoEncapsulation {
	
	public static void main(String[] args) {
		
		
		BeanClass obj = new BeanClass(101,"Raman","Blue");
		
		BeanClass obj1 = new BeanClass(102,"Kiran","White");
		
		
		System.out.println(obj1.getColor());
		System.out.println(obj1.getName());
		System.out.println(obj1.getId());
		
		
		
		
	}

}
