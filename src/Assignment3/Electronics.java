package Assignment3;

public class Electronics extends Item 
{
	private boolean fragile;
	private String state;
	
	public Electronics(String n, double p, int q, int w, boolean f, String s ) {
		super(n, p, q, w); 
		fragile = f;
		state = s;
		// TODO Auto-generated constructor stub
	}
	// Variables, constructors etc. here.

	
	public boolean isFragile() {
		return fragile;
	}
	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//Implement calculate price/print methods as necessary

	float calculatePrice () 
	{
		float final_price = 0;
		// Insert price calculation here
		final_price += quantity * price;
		if(!(state.equals("TX") || state.equals("NM") || state.equals("VA") || state.equals("AZ") || state.equals("AK"))){
			final_price += final_price * .10;
		}
		final_price += (20*(weight))*quantity;
		if(fragile){
			final_price += ((20*(weight))*quantity) * .20;
		}
		return final_price;
	}
	void printItemAttributes () 
	{
		//Print all applicable attributes of this class
		if(fragile){
			System.out.printf("%s %f %d %d F %s\nTotal Charge: %f", name, price, quantity, weight, state, calculatePrice()  );
		}	
		else{
			System.out.printf("%s %f %d %d NF %s\nTotal Charge: %f", name, price, quantity, weight, state,  calculatePrice()  );
		}
		
	}
}
