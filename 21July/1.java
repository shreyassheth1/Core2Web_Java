class Football{

}
class Cricket{
	public static void main(String[] args) {
		Cricket test  = new Cricket();
		Cricket oneDay = new Cricket();
		Cricket T35 = null;

		//System.out.println(Football instanceof Football);
		System.out.println(Cricket instanceof Object);
		System.out.println(test instanceof Cricket);
		System.out.println(oneDay instanceof Cricket);
		System.out.println(T35 instanceof Cricket);
	}
}