class IndianArmy{
	int workforce = 200;
	static int panzer = 6;
	public void attack(){
		System.out.println(workforce+" workforce "+panzer+" panzer"+ " are ready to attack" );
	}
}
class IndianNavy{
	int workforce = 175;
	static int ships = 10;
	public void attack(){
		System.out.println(workforce+" workforce "+ships+" ships"+ " are ready to attack" );
	}
}
class IndianAirForce{
	int workforce = 100;
	public static int planes = 6;
	void attack(){
		System.out.println(workforce+" workforce "+planes+" planes"+ " are ready to attack" );
	}
}
class IndianDefence{
	public static void main(String[] args) {
		IndianArmy IA = new IndianArmy();
		IA.attack();
		IndianNavy IN = new IndianNavy();
		IN.attack();
		IndianAirForce IAF = new IndianAirForce();
		IAF.attack();
	}
}