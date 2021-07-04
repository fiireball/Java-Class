package dev.fiire;

import java.util.Objects;

public class Weapon {

	private int bonusDamage;
	private String name;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weapon other = (Weapon) obj;
		return bonusDamage == other.bonusDamage && Objects.equals(name, other.name);
	}

	public int getBonusDamage() {
		return bonusDamage;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bonusDamage, name);
	}

	public void setBonusDamage(int bonusDamage) {
		this.bonusDamage = bonusDamage;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Weapon [bonusDamage=" + bonusDamage + ", name=" + name + "]";
	}

}
