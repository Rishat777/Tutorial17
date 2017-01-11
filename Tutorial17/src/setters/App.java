package setters;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*class Olympia extends A{*/
/*	private String intro;
	private int age;
	private String goal;

	public void setIntro(String bio) {
		this.intro = bio;
	}

	public void setAge(int yearsPro) {
		this.age = yearsPro;
	}

	public void setGoal(String vision) {
		this.goal = vision;
	}

	public String getIntro() {
		return intro;
	}

	public int getAge() {
		return age;
	}

	public String getGoal() {
		return goal;
	}

	public void setInfo(String name, int age) {
		setIntro(name);
		setAge(age);
		
	}
}
	public class App {
	public static void main(String[] args) {
		Olympia bodybuilders = new Olympia();

		bodybuilders.setIntro("I am Kevin Levrone. You all know the age of a legend. That's right baby. It's ");
		bodybuilders.setAge(52);
		bodybuilders.setGoal("And this Sandow is for you, baby!");

		System.out.println(bodybuilders.getIntro() + bodybuilders.getAge() + "\n" + bodybuilders.getGoal());
	}*/
	
	public class App extends A{
	
	public static void main (String [] args) {
		
		FizzBuzz(100);	
		A a = new A();
		a.reverseString("WElcome");
		
		

	}
	
	
	public void reverseString (String str) {
		String mytext = str;
		String reverse = new StringBuilder(mytext).reverse().toString();
		System.out.println(reverse);
			}
	
	public static void FizzBuzz (int num) {
		for(int i=1; i<num; i++) {
			if(i %(3*5) == 0) System.out.println("Fizzbuzz");
			else if (i %3 ==0) System.out.println("Buzz");
			else if (i %5 ==0) System.out.println("Fizz");
			else {
				System.out.println(i);
			}
			
		}
	
	}
	
	
}

class A {
	
	public void reverseString (String str) {
		if ((str==null)||(str. length()<= 1) )

			System.out.println(str);

			String text = new StringBuilder(str).reverse().substring(1) + str. charAt(0);	
			System.out.println(text);
		
}
	
	
}
