package dev.fiire;

public class App {

	public static void main(String[] args) {
		Gear gear = new Gear();
		
		System.out.println(gear);
		System.out.println(gear.getArmor());
		System.out.println(gear.getWeapon().toString());
	}

}
