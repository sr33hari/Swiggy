package pos;

import java.util.HashMap;
import java.util.Random;

import javax.swing.JOptionPane;

public class UI implements OrderReady,Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UI ui = new UI();

		for(int i=0;i<5;i++)
			ui.prompt();


	}
	
	public void prompt() {
		Dish ff = new Dish(" French Fries", "McDonalds", 99, 7);
		Dish mp = new Dish(" Margherita Pizza", "Dominos", 150, 10);
		Dish bp = new Dish(" BBQ Pizza", "Dominos", 200, 15);
		Dish vsp = new Dish(" Veggie Supreme Pizza", "Dominos", 180, 15);
		Dish dbc = new Dish(" Death By Chocolate", "Corner House", 200, 9);
		Dish ps = new Dish(" Pineapple Sundae", "Corner House", 150, 7);
		Dish ss = new Dish(" Strawberry Shake", "Corner House", 160, 8);
		Dish mnc = new Dish(" Mac n Cheese", "The bowl company", 190, 10);
		Dish tgc = new Dish(" Thai green curry", "The bowl company", 230, 12);
		Dish ppc = new Dish(" Peri Peri chicken", "The bowl company", 220, 13);
		
		Dish[] availableDishes = new Dish[] {ff, mp, bp, vsp, dbc, ps, ss, mnc, tgc, ppc, };
		int i=0;
		for( Dish dish : availableDishes) {
			System.out.println(i+" " + dish.getName() + "    ---    " + dish.getPrice()+" Rs");
			i++;
		}
		String input;
		input = JOptionPane.showInputDialog("Enter your choice :");
		int choice = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter quantity :");
		int quant = Integer.parseInt(input);
		
		
		Dish selection  = availableDishes[choice];
		selection.setQuantity(quant);
		JOptionPane.showMessageDialog(null, "Your Order of " + selection.getName() + " is now being processed and costs " + selection.getQuantity()*selection.getPrice() + "Rupees");
		Restaurant rest = new Restaurant(selection, this);
		rest.start();
		
	}

	@Override
	public void foodReady(Dish dish) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> boys = new HashMap<>();
		
		boys.put("Mahesh", 15);
		boys.put("Ramesh", 20);
		boys.put("Suresh", 35);
		
		Object[] randomAgent = boys.keySet().toArray();
		Object key = randomAgent[new Random().nextInt(randomAgent.length)];
		

		
		JOptionPane.showMessageDialog(null, "Your dish" + dish.getName() + " is now ready and will be delivered by " + key +" in " + boys.get(key) + " minutes!");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
