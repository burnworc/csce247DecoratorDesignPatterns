/**
 * Decorates the skill attributes for the player
 * @author Cole
 *
 */
public class Skill extends PlayerDecorator {
	Player player;
	
	/**
	 * Sets the parameter for the player
	 * @param player
	 */
	public Skill(Player player) {
		this.player = player;
	}
	
	/**
	 * Returns the decorated toString that resulted from gaining a skill
	 */
	public String toString() {
		return player.toString() + "\nGained a skill";
	}
	
	/**
	 * Returns the updated power for the player that resulted from gaining a skill
	 */
	public double getPower() {
		return player.getPower() + 2.0;
	}
}
