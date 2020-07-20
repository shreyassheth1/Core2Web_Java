class Pune{
	static int activeCases = 10000;
	int totalCases = 50000;
	static void noCorona(){
		System.out.println("go corona worked :)");
	}
	public void lockdown(){
		System.out.println("\nLockdown : ");
		activeCases++;
		totalCases++;
		System.out.println("Active Cases : " + activeCases);
		System.out.println("Total Cases : " + totalCases);
	}
	public void noLockdown(){
		System.out.println("\nNo Lockdown : ");
		activeCases+=100;
		totalCases+=100;
		System.out.println("Active Cases : " + activeCases);
		System.out.println("Total Cases : " + totalCases);
	}
}
class Mumbai{
	static int activeCases = 31000;
	int totalCases = 100000;
	static void noCorona(){
		System.out.println("go corona worked");
	}
	public void lockdown(){
		System.out.println("\nLockdown : ");
		activeCases++;
		totalCases++;
		System.out.println("Active Cases : " + activeCases);
		System.out.println("Total Cases : " + totalCases);
	}
	public void noLockdown(){
		System.out.println("\nNo Lockdown : ");
		activeCases+=100;
		totalCases+=100;
		System.out.println("Active Cases : " + activeCases);
		System.out.println("Total Cases : " + totalCases);
	}
}
class Fifth{
	public static void main(String[] args){
		System.out.println("\nPUNE : \n");
		Pune pune = new Pune();
		pune.noCorona();
		pune.lockdown();
		pune.noLockdown();
		System.out.println("\nMUMBAI : \n");
		Mumbai mumbai = new Mumbai();
		mumbai.noCorona();
		mumbai.lockdown();
		mumbai.noLockdown();
	}
}