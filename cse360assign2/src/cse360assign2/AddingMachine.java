package cse360assign2;
/**keeps track of a total sum */
public class AddingMachine {

	private int total;
	private String history;
	
	/**constructor, initialize total and history as 0 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**should return total */
	public int getTotal () {
		return total;
	}
	
	/**increase total by a new value */
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	/**decrease total by a new value */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
		
	/**return a string showing all operations done to total thus far */
	public String toString () {
		return history;
	}

	public void clear() {
	
	}
}
