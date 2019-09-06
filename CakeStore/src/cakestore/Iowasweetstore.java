package cakestore;

public class Iowasweetstore extends Sweetstore{

	Cake createCake(String item) {
		if (item.equals("Angel")) {
			return new IowaSpecial();
		} else if (item.equals ("Vanilla")) {
			return new Iowaspecial2();
		} else return null;
	}
}
