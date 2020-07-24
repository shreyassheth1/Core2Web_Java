class Precedence{
	public static void main(String[] args) {
		int a = 25, b = -34, c = 19, d = 4;
		int res = ((a << 2 | b >> 3));
		boolean result = ((a << 2 | b >> 3) < -10 ) || ((c++ << 2 & b-- >>> d) >= 23);
		System.out.println(result);
	}
}
//first a<<2 and b>>3 is calculated then bracket is solved and is compared if its less than -10
//if its false then c++ is calculated then c << 2 then b-- then b>>>d which are anded then compared if greater than 23