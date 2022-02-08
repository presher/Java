package car_dealership;

public class SalesPerson  {
	private Double fees = 200.00;
	private String name;
	private int id;

	
	
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() + getFees();
			Boolean result = runCreditHistory(cust, loanAmount);
			if(result) {
				return "Your loan was approved ";
			}else {
				Boolean purchase = processTransation(cust, vehicle);
				if(purchase) {
					return "You have successfully purchased the vehicle";
				}else {
					return "Bring more money";
				}
			}
			
		}else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			Boolean purchase = processTransation(cust, vehicle);
			if(purchase) {
				return "You have successfully purchased the vehicle";
			}else {
				return "Bring more money";
			}
		}else {
			return "Your loan was denied";
		}
	}
	
	private Boolean runCreditHistory(Customer cust, double loanAmount) {
		if(cust.getCashOnHand() > loanAmount) {
			return false;
		}
		Boolean loanAccepted = true;
		return loanAccepted;
	}
	
	private Boolean processTransation(Customer cust, Vehicle vehicle) {
		Boolean isPurchased = false;
		if(cust.getCashOnHand() >= vehicle.getPrice()) {
			isPurchased = true;
		}
		
		return isPurchased;
	}

}
