package car_dealership;

import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What vehicle are you purchasing\n");
		System.out.print("Please enter Make...");
		String make = sc.nextLine();
		
		System.out.print("Please enter Model...");
		String model = sc.nextLine();
		
		System.out.print("Please enter Year of " + make + " " + model);
		String year = sc.nextLine();
		
		System.out.print("Please enter Color of " + year + " " + make + " " + model);
		String color = sc.nextLine();
		
		System.out.print("Please enter Amount of " + year + " " + make + " " + model);
		String amount = sc.nextLine();
		
		Vehicle vehicle = new Vehicle(color, make, model, year, Double.parseDouble(amount));
		
		
		SalesPerson emp = new SalesPerson();
		emp.setId(12345);
		emp.setName("Steve Dobbs");
		
		
		Customer cust1 = new Customer();
		
		cust1.setName("Jason");
		cust1.setAdress("5001 Nocona Ln");
		
		System.out.print("What is your Cash on Hand\n");
		String price = sc.nextLine();
		System.out.print("Do you want to purchase a loan  yes no?\n");
		String loan = sc.nextLine();
		sc.close();
		boolean isLoanNeeded = false;
		cust1.setCashOnHand(Integer.parseInt(price));
		if(loan == "yes") {
			isLoanNeeded = true;
		}
		
		cust1.purchaseCar(vehicle, emp, isLoanNeeded);

	}

}
