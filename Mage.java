/**
 * Contains all the attributes for the mage player
 * @author Cole
 *
 */
public class Mage extends Player {
	public Mage(String name) {
		this.name = name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	
	/**
	 * Displays the attributes and description for the Mage player
	 */
	public String toString() {
		return "Mage: " + super.toString();
	}
}
