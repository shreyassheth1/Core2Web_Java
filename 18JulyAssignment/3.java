class Third{
	public static void main(String[] args) {
		int i = 10,j= 20;
		System.out.println("(i++ >= j++) && (--j < i++) =" + ((i++ >= j++) && (--j < i++)));
		System.out.println("(--i < j--) || (j++ >= ++i) =" + ((--i < j--) || (j++ >= ++i)));

	}
}