/**
 * Contains all the methods and attributes for the Healer player
 * @author Cole
 *
 */
public class Healer extends Player {
	public Healer(String name) {
		this.name = name;
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	
	/**
	 * Displays the attributes and description for the Healer player
	 */
	public String toString() {
		return "Healer: " + super.toString();
	}
}
