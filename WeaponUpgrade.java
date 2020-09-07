/**
 * Decorates the attributes for weapons for the player
 * @author Cole
 *
 */
public class WeaponUpgrade extends PlayerDecorator {
	Player player;
	
	/**
	 * Sets the parameters for the player
	 * @param player
	 */
	public WeaponUpgrade(Player player) {
		this.player = player;
	}
	
	/**
	 * Returns the decorated toString that resulted from upgrading a weapon
	 */
	public String toString() {
		return player.toString() + "\nUpgraded weapon";
	}
	
	/**
	 * Returns the decorated power that resulted from upgrading a weapon
	 */
	public double getPower() {
		return player.getPower() + 5.0;
	}
}
