package staticAndFinal;

import java.awt.Font;

class Thing {
	
	public String name;
	public static String description;
	
	public void showName() {
		System.out.println(name);
	}
	public static void showInfo() {
		System.out.println(description);
	}
}





public class App {

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
