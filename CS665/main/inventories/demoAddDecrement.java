package inventories;

public class demoAddDecrement {
	
	public static void main(String[] args) {
		System.out.println("-In this demo lines that begin with a dash \"-\" explain the demo.\n"
				+ "-Any other lines are generated by the system.\n"
				+ "-Let's create Refrigerators \"Kitchen\", \"Pool House\"\n"
				+ "-and ShoppingList \"Market List\".\n");
		
		InventoryManager InvMaster = new InventoryManager();
		
		Refrigerator kitchen = new Refrigerator(InvMaster, "Kitchen");
		Refrigerator poolHouse = new Refrigerator(InvMaster, "Pool House");
		ShoppingList marketList = new ShoppingList(InvMaster, "Market List");
		
		
		System.out.println("\n-Is the Kitchen:Refrigerator empty?\n");
		kitchen.isEmpty();
		
		System.out.println("\n- Let's add Chedder Cheese 2, Milk 1, and try to add Butter, -2");
		kitchen.addItem("Chedder Cheese", 2, "Dairy");
		kitchen.addItem("Milk", 1, "Dairy");
		kitchen.addItem("Butter", -2, "Dairy");
		
		System.out.println("\n-Is the Kitchen Refrigerator still empty?");
		kitchen.isEmpty();
		
		kitchen.printContents();
		
		System.out.println("-Lets Increment Milk.");
		kitchen.incrementItem("milk");
		
		kitchen.printContents();
		
		System.out.println("-Now let's try to update milk's Qty to -2\n"
				+ "-Remove Chedder Cheese."
				+ "-and Decrement Butter.");
		kitchen.updateItemQuantity("milk", -2);
		kitchen.removeItem("Chedder Cheese");
		kitchen.decrementItem("butter");
		
		kitchen.printContents();
		System.out.println("-Notice, Chedder Cheese is gone, but Milk and Butter are unchanged.\n"
				+ "-The system will not allow an item to drop below a quantity of Zero.");
		
		
		System.out.println("-Let's Increment butter, and try to remove Chedder Cheese again.");
		kitchen.incrementItem("butter");
		kitchen.removeItem("Chedder Cheese");
		
		kitchen.printContents();
		
		System.out.println("-The system couldn't find Chedder Cheese in the Kitchen Refrigerator.\n"
							+ "-Now let's decrement butter");
		kitchen.decrementItem("butter");
		
		kitchen.printContents();

		System.out.println("-Now let's work with our hoppingList \"Market List\".\n"
				+ "-Let's add some apples, bananas and Peanut Butter");
		marketList.addItem("Apples", 12, "Produce");
		
		marketList.addItem("Steak", -2, "Meat");
		
		marketList.addItem("Peanut Butter", 1, "Misc");
		
		marketList.printContents();
		
		System.out.println("-Now let's try to increment Milk, and decrement Peanut Butter in our shopping list.\n");
		marketList.incrementItem("milk"); //TODO need to add error checking for when and Item is not found
		marketList.decrementItem("Peanut Butter");
		marketList.printContents();
		
		System.out.println("-Lastly lets check if each of our Inventories are empty.\n");
		kitchen.isEmpty();
		poolHouse.isEmpty();
		marketList.isEmpty();
		
		
		
	}
}
