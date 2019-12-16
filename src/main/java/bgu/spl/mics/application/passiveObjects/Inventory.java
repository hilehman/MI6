package bgu.spl.mics.application.passiveObjects;

import java.util.List;

/**
 *  That's where Q holds his gadget (e.g. an explosive pen was used in GoldenEye, a geiger counter in Dr. No, etc).
 * <p>
 * This class must be implemented safely as a thread-safe singleton.
 * You must not alter any of the given public methods of this class.
 * <p>
 * You can add ONLY private fields and methods to this class as you see fit.
 */
public class Inventory {
	private List<String> gadgets;


	// creating a singleton
	private static class SingletonHolder {
		private static Inventory inventory = new Inventory();
	}
	/**
	 * Retrieves the single instance of this class.
	 */
	public static Inventory getInstance() {
		return SingletonHolder.inventory;
	}

	/**
	 * Initializes the inventory. This method adds all the items given to the gadget
	 * inventory.
	 * <p>
	 * @param inventory 	Data structure containing all data necessary for initialization
	 * 						of the inventory.
	 */
	public void load (String[] inventory) {
		//gadgets = new List<String>();
		for (String gadget : inventory) {
			gadgets.add(gadget);
		}
	}

	/**
	 * acquires a gadget and returns 'true' if it exists.
	 * <p>
	 * @param gadget 		Name of the gadget to check if available
	 * @return 	‘false’ if the gadget is missing, and ‘true’ otherwise
	 */
	public boolean getItem(String gadget){
		if (!gadgets.isEmpty()){
			int index = gadgets.indexOf(gadget);
			if (index != -1) {
				gadgets.remove(index);
				return true;
			}
		}
		return false;
	}

	public List<String> getGadgetsList(){
		return gadgets;
	}


	/**
	 *
	 * <p>
	 * Prints to a file name @filename a serialized object List<Gadget> which is a
	 * List of all the reports in the diary.
	 * This method is called by the main method in order to generate the output.
	 */
	public void printToFile(String filename){
		//TODO: Implement this
	}
}
