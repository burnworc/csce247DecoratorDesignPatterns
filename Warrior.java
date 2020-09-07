/**
 * Contains the methods for the warrior character
 * @author Cole
 *
 */
public class Warrior extends Player {
	public Warrior(String name) {
		this.name = name;
		this.intellect = 2;
		this.attack = 8;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	
	/**
	 * Displays Warrior and it's attributes
	 */
	public String toString() {
		return "Warrior: " + super.toString();
	}
}
