package pos;

public class Dish {
	
	private String name;
	private String restaurant;
	private double price;
	private int quantity;
	private double cookingTime;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCookingTime() {
		return cookingTime;
	}

	public void setCookingTime(double cookingTime) {
		this.cookingTime = cookingTime;
	}

	public Dish(String name, String restaurant, double price, double cookingTime) {
		super();
		this.name = name;
		this.restaurant = restaurant;
		this.price = price;
		this.cookingTime = cookingTime;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
