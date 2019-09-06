package cakestore;

/* This implements the Ohio cake store */

public class Ohiosweetstore extends Sweetstore{

	Cake createCake(String item) {
		if (item.equals("carrot")) {
			return new OhioSpecial();
		} else if (item.equals ("Cheesecake")) {
			return new OhioSpecial2();
		} else return null;
	}
}
