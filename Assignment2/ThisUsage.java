public class ThisUsage {
	int planets;
	static int suns;
	
	public void gaze() {
		int i;
		i = this.planets;
		i = this.suns;
		// error this = new ThisUsage();
		//error this.i = 4;
		this.suns = planets;
	}
}