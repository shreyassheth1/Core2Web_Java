class COVID19{
	
}
class Lockdown extends COVID19 {
	Lockdown(){
		System.out.println("in constructor");
	}
	public static void main(String args[]){
	Lockdown obj = new Lockdown();
	 System.out.println("lockdown extended");
	}
}
