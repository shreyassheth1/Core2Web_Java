class Core2Web{
	static int totalStudCount = 2500;
	int batchStudCount = 0;
	void dispStudCount(){
		System.out.println("totalStudent ="+ totalStudCount);
		System.out.println("BatchStudent ="+ batchStudCount);
	}
}
class C2WAppAdmin{
	static int totalLoginCount = 2500;
	int videoCount = 0;
	void dispStat(){
		System.out.println("totalLoginCount ="+ totalLoginCount);
		System.out.println("videoCount =" + videoCount);
	}
}
class Mentor{
	public static void main(String[] args) {
		Core2Web java9_10 = new Core2Web();
		java9_10.batchStudCount = 370;
		java9_10.dispStudCount();
		Core2Web ppa5 = new Core2Web();
		ppa5.batchStudCount = 400;
		ppa5.dispStudCount();
		C2WAppAdmin python0 = new C2WAppAdmin();
		python0.videoCount = 25;
		python0.dispStat();
		C2WAppAdmin os = new C2WAppAdmin();
		os.videoCount = 150;
		os.dispStat();
	}
}