class CoronaMaha{
	int count = 170000;
	void takeCare(){
		System.out.println("take care count is increasing");
		System.out.println("Count = +" +count);
	}
	static void impDecision(){
		System.out.println("CM's Decision");
	}
	public static void main(String[] args) {
		CoronaMaha June29 = new CoronaMaha();
		June29.takeCare();
		impDecision();
		CoronaMaha June30 = new CoronaMaha();
		June30.count+=1000;
		June30.takeCare();
		impDecision();
	}
}