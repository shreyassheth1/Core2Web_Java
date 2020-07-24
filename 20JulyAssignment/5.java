class Cricket{
	static int boundary = 2;
	int teams = 2;
	static int ball = 1;
	int defenders = 11;
	int attacker = 2;
	static void Score(){
		System.out.println("if ball outside of boundary its an 6 or 4");
	}
	void noOfPlayers(){
		System.out.println("there are "+attacker+" batsman and "+defenders+" fielders on the field");
	}
	public static void main(String[] args) {
		Cricket cr = new Cricket();
		cr.Score();
		cr.noOfPlayers();
	}

}