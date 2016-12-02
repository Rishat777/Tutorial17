package staticAndFinal;


class Example
{
	private int var;
	public Example()
	{
		var = 10;
	}
	public Example(int num) {
		var = num;
	}
	public int getValue(){
		return var;
	}
	public static void main(String[] args) {
		
		Example obj2 = new Example(77);
		System.out.println("Var is: " + obj2.getValue());
	}

}


































/*class WelcomeMessage
{
	void printMessage()
	{
		String greeting = "Welcome to Java Tutorial!";
		for(int i=0; i<9; i++) {
		System.out.println(greeting + "\t");
		System.out.println("Number of Greetings: " + i);
		}
	}
}


public class BasicLoops {

	public static void main(String[] args) {
		WelcomeMessage obj = new WelcomeMessage();
		obj.printMessage();*/


