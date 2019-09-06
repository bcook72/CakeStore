package cakestore;

/* This implements our factory method the cake store called the sweetstore */

public abstract class Sweetstore {
	
	public Cake orderCake(String type) {
		Cake cake;
		
		cake = createCake(type);
		
		cake.select();
		cake.cook();
		cake.box();
		
		return cake;
	}

	abstract Cake createCake(String type);
}
