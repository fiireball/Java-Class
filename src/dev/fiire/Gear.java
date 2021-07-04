package dev.fiire;

/**
 * @author User
 *
 */
public class Gear {
	private Armor armor;
	private Weapon weapon;

	public Gear() {
		this.weapon = new Weapon();
		this.armor = new Armor();
	}

	public Armor getArmor() {
		return armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
