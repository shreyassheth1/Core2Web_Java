class BoycottChina{
	static int revenue = 100;
	static int industries = 90;
	int export = 50,import1 =100;

	void boycottProducts(){
		import1--;
		export++;
		System.out.println("import is decreasing and export is increasing");
	}
	static void makeInIndia(){
		revenue++;
		industries++;
		System.out.println("revenue is increasing,industries are booming ");
	}
	public static void main(String[] args) {
		BoycottChina boycott = new BoycottChina();
		boycott.boycottProducts();
		boycott.makeInIndia();
	}
}