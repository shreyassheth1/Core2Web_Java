class Converter{
	void printConvertedValues(int num){
		System.out.println("For number "+num +" converted values are");
		String hexa = Integer.toHexString(num);
		System.out.println("HexaDecimal Value is : " + hexa);
        String octal = Integer.toOctalString(num);
		System.out.println("Octal Value is : " + octal);
		String binary = Integer.toBinaryString(num);
		char a = '\t';
		//incompete was not able to do it
		for(int i=0;i<binary.length();i++){
			if(binary.charAt(i)=='0'){
				binary.charAt(i)=a;
			}
		}
		System.out.println("Binary Value is : " + binary);
	}
	public static void main(String[] args) {
		Converter con = new Converter();
		con.printConvertedValues(10);
		con.printConvertedValues(18);
		con.printConvertedValues(5);
		con.printConvertedValues(20);
	}
}