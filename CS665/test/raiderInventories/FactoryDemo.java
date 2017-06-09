package raiderInventories;

import raiderInventories.InventoryManager;
import raiderInventories.RaiderItem;

public class FactoryDemo {

	public static void main(String[] args) {
		
		System.out.println("-lines that begin with a dash \"-\" explain the demo.\n"
				+ "-Any other lines are generated by the system."
				+ "\n-Let's create Refrigerator \"Kitchen\" \n");
		
		InventoryManager InvMaster = InventoryManager.getInstance();
		
		RaiderInventory kitchen = InvMaster.addInventory("Kitchen", 02, "Refrigerator");
		
		System.out.println("\n- Let's add dairy item Chedder Cheese 2,\n"
				+ "meat item Beef \n"
				+ "and try to add tooth paste, -2");
		kitchen.addItem("Chedder Cheese", 2, "Dairy");
		kitchen.addItem("beef", 1, "Meat");
		kitchen.addItem("tooth paste", -2, "Misc");
		
		kitchen.printContents();
		
		for(RaiderItem i: kitchen.itemInventory){
			System.out.println(i.getItemName() + " is an instance of "+ i.getClass() + "\n");
		}//end for

	}//end main

}//end FactoryDemo
