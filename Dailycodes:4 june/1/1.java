
class Relationship {
	int noOfFriends =10;
	static int bestFriends = 2;
	int yearsOfRealtionShip = 1;
	void girlFriend(){
		System.out.println("until breakup");
	}
	static void bestFriend(){
		System.out.println("Forever");
	}
	
}
class SocailLife{
public static void main(String args[]){
	Relationship obj = new Relationship();
	 obj.girlFriend();
	 obj.bestFriend();
}
}
