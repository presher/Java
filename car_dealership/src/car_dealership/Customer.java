package car_dealership;

public class Customer {
	
	
	private String name;
	private String adress;
	private Double cashOnHand;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	
	public void purchaseCar(Vehicle vehicle, SalesPerson emp, boolean finance) {
		String purchased = emp.handleCustomer(this, finance, vehicle);
			System.out.print(purchased + vehicle);
		
		
		
	}

	
}
