class Operations{
	void multiply(int a,int b){
		System.out.println("multiply "+String.valueOf(a*b));
	}
	void divide(int a,int b){
		System.out.println("divide "+String.valueOf(a/b));
	}
	void addition(int a,int b){
		System.out.println("addition "+String.valueOf(a+b));
	}
	void subtraction(int a,int b){
		System.out.println("subtraction "+ String.valueOf(a-b));
	}
	void modulus(int a,int b){
		System.out.println("modulus"+String.valueOf(a%b));
	}
	public static void main(String[] args) {
		int a =10,b=20;
		Operations op = new Operations();
		op.multiply(a,b);
		op.divide(a,b);
		op.addition(a,b);
		op.subtraction(a,b);
		op.modulus(a,b);
	}
}