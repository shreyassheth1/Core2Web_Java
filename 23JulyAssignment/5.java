class Attendance{
    boolean check(int n){
       System.out.println("Student's attendance is "+n+ "\nprocessing...");
       if(n<75){
        return false;
       }
       return true;
    }
    public static void main(String[] args) {
        int attendance =65;
        Attendance a = new Attendance();
        if(a.check(attendance)){
            System.out.println("is eligible for exams");
        }
        else{
         System.out.println("is not eligible for exams");
        }
    }
}
