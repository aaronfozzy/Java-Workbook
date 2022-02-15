package basic;

public class ReturnTypes {

	static String myMethod() {
	    String name = "hello world!";
	    return name;
	}
	    
	    public static void main(String args[]) {
	        
	    	ReturnTypes test = new ReturnTypes();
	    	String myMethod = test.myMethod();
	        System.out.println(myMethod);
	     }
	    
	}
