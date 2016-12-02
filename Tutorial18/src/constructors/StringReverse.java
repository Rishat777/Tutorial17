package constructors;

public class StringReverse {
	 public String reverse(String myString) 
	    {     
	        if ((myString==null)||(myString.length() <= 1) )
	            return myString;
	        return reverse(myString.substring(1)) + myString.charAt(0);
	    }
	public static void main(String[] args) {
		StringReverse reversed=new StringReverse();
        String str = "The reverse string text generator";
        System.out.println("Reverse of \'"+str+"\' is \'"+reversed.reverse(str)+"\'");   
        
        ReverseString("!gnirtS esrever eht si siht ,emocleW");

	}
	
	public static void ReverseString(String text) {
		String string = text;
		String reverse = new StringBuilder(string).reverse().toString();
		System.out.println(reverse);
	}
	


}
