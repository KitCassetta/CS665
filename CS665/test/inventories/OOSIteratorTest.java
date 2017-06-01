package inventories;

import static org.junit.Assert.*;

import org.junit.Test;

public class OOSIteratorTest {

	@Test
	public void test() {
		InventoryManager testManager = new InventoryManager();
		Refrigerator testFridge = new Refrigerator(testManager, "test Fridge");
		testFridge.addItem("Baby Spinich", 2, "produce");
		testFridge.addItem("Milk", 0, "Dairy");
		testFridge.addItem("butter", 0, "Dairy");
		testFridge.addItem("beef", 2, "Meat");
		testFridge.addItem("chicken", 2, "Meat");
		testFridge.addItem("baking soda",1, "misc");
		testFridge.addItem("eggs", 0, "Meat");
		
		
		InvIterator<Item> it = new OOSIterator(testFridge);
		
		it.setToFirst();
		Item currentIt = it.getCurrentElement();
		
		//assert statements
		assertEquals(7, testFridge.itemInventory.size());
		assertEquals("Milk", currentIt.getItemName());
		assertEquals(false, it.isDone());
		
		it.increment();
		currentIt = it.getCurrentElement();
		assertEquals("butter", currentIt.getItemName());
		assertEquals(false, it.isDone());
		
		it.increment();
		currentIt = it.getCurrentElement();
		assertEquals(false, it.isDone());
		
		
		it.increment();
		assertEquals(true, it.isDone());
		
		testFridge.printOOS();
	}
}
