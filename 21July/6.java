class TernaryDemo{
	public static void main(String[] args) {
		int x =5,y=10,z=20;
		int result = (x>y)? (x>z)? x: z : (y>z)? y: z;
		System.out.println(result);
	}
}