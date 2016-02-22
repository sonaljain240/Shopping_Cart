package Assignment3;

public class Clothing extends Item 
{

	// variables, constructors as necessary
	
	public Clothing(String n, double p, int q, int w) {
		super(n, p, q, w);
		// TODO Auto-generated constructor stub
	}

	float calculatePrice () 
	{
		float final_price = 0;
		// Insert price calculation here
		final_price += quantity * price;
		final_price += final_price * .10;
		final_price += (20*(weight))*quantity;
		return final_price;
	}
	
	void printItemAttributes () 
	{
		//Print all applicable attributes of this sub-class
		
		System.out.printf("%s %f %d %d Total Charge: %f", name, price, quantity, weight, calculatePrice()  );
	
	}	
}
	


