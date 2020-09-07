/**
 * Abstract class that contains all the base methods for the video game
 * @author Cole
 *
 */
public abstract class Player {
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	/**
	 * Returns a generic output for each character based on characteristics
	 */
	public String toString() {
		return name+ "\nCarries a "+weapon+", and wears a "+armor; 
	}
	
	/**
	 * Returns the power for the specified player
	 * @return
	 */
	public double getPower() {
		double power = attack * 3 + defense + intellect / 2;
		return power;
	}
}
