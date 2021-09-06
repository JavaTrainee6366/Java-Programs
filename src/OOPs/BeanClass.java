package OOPs;

public class BeanClass {
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	private int id;
	public BeanClass(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}

	private String name;
	private String color;
	
	
	

}
