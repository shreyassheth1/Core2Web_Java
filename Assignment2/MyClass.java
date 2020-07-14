public class MyClass {
	long var;
	
	MyClass(){
		
	}
	MyClass(long param) { 
		var = param; 
	} //(1)


	public static void main(String[] args) {
		MyClass a, b;
		a = new MyClass();					//(2)
		b = new MyClass(500000000);					//(3)
	}

}