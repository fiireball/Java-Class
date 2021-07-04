package dev.fiire;

/**
 * @author User
 *
 */
public class Gear {
	private Weapon weapon;
	private Armor armor;

	public Gear() {
		this.weapon = new Weapon();
		this.armor = new Armor();
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

}
