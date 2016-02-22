package Assignment3;


public class Grocery extends Item {
	
	private boolean perishable;
	
	public Grocery(String n, double p, int q, int w, boolean b) {
		super(n, p, q, w);
		perishable = b;
		
		// TODO Auto-generated constructor stub
	}
	//variables, constructor here


	public boolean isPerishable() {
		return perishable;
	}

	public void setPerishable(boolean perishable) {
		this.perishable = perishable;
	} 
	
	//override calculatePrice() if necessary; Implement print methods as necessary	
	// Only re-implement stuff you cannot get from the superclass (Item)
	
	float calculatePrice () 
	{
		float final_price = 0;
		// Insert price calculation here
		final_price += quantity * price;
		final_price += (20*(weight))*quantity;
		if(perishable){
			final_price += ((20*(weight))*quantity) * .20;
		}
		return final_price;
	}
	void printItemAttributes () 
	{
		//Print all applicable attributes of this class
		if(perishable){
			System.out.printf("%s %f %d %d P\nTotal Charge: %f", name, price, quantity, weight, calculatePrice()  );
		}	
		else{
			System.out.printf("%s %f %d %d NP\nTotal Charge: %f", name, price, quantity, weight, calculatePrice()  );
		}
		
	}
}
