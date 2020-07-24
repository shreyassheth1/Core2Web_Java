class Arithmetic{
	static int a;
	static int b;
	static void initalizer(){
		a = 10;
		b = 20;
	}
	void operations(){
		System.out.println("add ->"+(a+b));
		System.out.println("sub ->"+(a-b));
		System.out.println("div ->"+(a/b));
		System.out.println("mul ->"+(a*b));
		System.out.println("mod ->"+(a%b));
	}
}
class Logical{
	static int a;
	static int b;
	static void initalizer(){
		a = 10;
		b = 20;
	}
	void operations(){
	System.out.println("a>b"+(a>b));
	System.out.println("a<b"+(a<b));
	System.out.println("a!=b"+(a!=b));
	System.out.println("a==b"+(a==b));
	System.out.println("a<=b"+(a<=b));
	System.out.println("a>=b"+(a>=b));	
	}
}
class Bitwise{
	static int a;
	static int b;
	static void initalizer(){
		a = 10;
		b = 20;
	}
	void operations(){
		System.out.println("a&b"+(a&b));
		System.out.println("a|b"+(a|b));
		System.out.println("a^b"+(a^b));
		System.out.println("~b"+(~b));
		System.out.println("b<<2"+(b<<2));
		System.out.println("b>>2"+(b>>2));
	}
}
class Operator{
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic();
		ar.initalizer();
		ar.operations();
		Logical lg = new Logical();
		lg.initalizer();
		lg.operations();
		Bitwise bt = new Bitwise();
		bt.initalizer();
		bt.operations();
	}
}