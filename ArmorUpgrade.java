/**
 * Implements the decoration for armor to the player
 * @author Cole
 *
 */
public class ArmorUpgrade extends PlayerDecorator {
	Player player;
	
	/**
	 * sets the parameters for the player
	 * @param player
	 */
	public ArmorUpgrade(Player player) {
		this.player = player;
	}
	
	/**
	 * Returns the decorated toString method with armor upgrade added on
	 */
	public String toString() {
		return player.toString() + "\nUpgraded armor";
	}
	
	/**
	 * Returns the updated power that resulted from upgrading armor
	 */
	public double getPower() {
		return player.getPower() + 3.0;
	}
}
