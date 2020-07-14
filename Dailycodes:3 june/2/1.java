
class Student {
	int rollno =10;
	static int registrationNo = 90282;
	int roomNo = 20;
	void reopening(){
		System.out.println("lectures will start online from 15 june");
	}
	static void offlineLectures(){
		System.out.println("Lectures will start offline asap");
	}
	
}
class College{
public static void main(String args[]){
	Student obj = new Student();
	 obj.reopening();
	 obj.offlineLectures();
}
}
