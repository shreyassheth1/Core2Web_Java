class Dominos{
	int price;
	int quantity;
	static int total;
	static void  bill(){
		System.out.println("order total is "+total);
		total =0;
	}
	public static void main(String[] args) {
	Dominos pizza = new Dominos();
	pizza.price = 50;
	pizza.quantity = 6;
	total = pizza.price * pizza.quantity;
	bill();

	Dominos fries = new Dominos();
	fries.price = 50;
	fries.quantity = 6;
	total = fries.price * fries.quantity;
	bill();
	}
}