package billing;

public class Food {
	
	private int price;
	private int id;
	private String name;
	private String type;
	
	public Food(int id, int price, String name, String type) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.type = type;
	}
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String printString() {
		return id + ")	" + name + "		" + "$" + price;
	}

}
