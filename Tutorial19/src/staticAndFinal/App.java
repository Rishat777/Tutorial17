package staticAndFinal;

import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Thing {
	
	public String name;
	public static String description;
	
	public void showName() {
		System.out.println(name);
	}
	public static void showInfo() {
		System.out.println(description);
		
		
		
	
	}
	
	public static void HashMap() {
		HashMap<Integer, String > hmap = new HashMap<Integer, String>();
		hmap.put(4, "Mark");
		hmap.put(5, "James");
		hmap.put(1, "Anthony");
		
		Set mentry = hmap.entrySet();
		Iterator it = mentry.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println("Value is:" + me.getValue());
			System.out.println("Key is: " + me.getKey());
	}
}





public static class App {

	public static void main(String[] args) {
		Font font = new Font("Ariel", Font.BOLD, 24);
		Thing.description = "I am a thing";
		Thing.showInfo();
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue" + font.isPlain();
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		
	}
}
}
