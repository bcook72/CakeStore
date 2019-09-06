package cakestore;

/* this is where we implement the abstract cake class and all cake orders will derive from this concrete class */

public abstract class Cake {
String name;
String frosting;
String extras;

void select() {
	System.out.println("You have selected " + name);
}

void cook() {
	System.out.println("Baking your yummy selection ");
}

void box() {
	System.out.println("Your cake is ready at counter 3");
}
public String getCakeName() {
	return name;
}
}
