package pos;

public class Restaurant extends Thread {
	
	Dish dish;
	OrderReady order;
	public Restaurant(Dish dish, OrderReady order) {
		super();
		this.dish = dish;
		this.order = order;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep((long) dish.getCookingTime()*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		order.foodReady(dish);
	}

}
