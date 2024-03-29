package cakestore;

/* This is where we place the order combining all of the pieces of the factory pattern */

public class CakeOrder {

	public static void main(String[] args) {
		Sweetstore ohStore = new Ohiosweetstore();
		Sweetstore IAStore = new Iowasweetstore();
		
		Cake cake = ohStore.orderCake("carrot");
		System.out.println("Thank you for ordering " + cake.getCakeName() + "\n");
		
		Cake cake1 = IAStore.orderCake("Angel");
		System.out.println("Thank you for ordering " + cake1.getCakeName() + "\n");
		
	}
}
