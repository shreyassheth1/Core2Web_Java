class BitwiseOperator{
	public static void main(String[] args) {
		//int a = 10,b =20;//works
		//long a =100,b=200;//works
		//char a = 'A',b = 'B';//works
		//float a = 12.5f,b = 22.5f;//doesnt works
		double a = 124.42, b = 214.5224;//doesnt works
		System.out.println("a | b = "+(a|b));
		System.out.println("a & b = "+(a&b));
		System.out.println("a ^ b = "+(a^b));
	}
}