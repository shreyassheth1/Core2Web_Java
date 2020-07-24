import java.util.Scanner;
class Compare{
    int compare(int n,int m){
        if(n>m){
            System.out.println(n+" greater");
            return 0;
        }
        System.out.println(m+" is smaller");
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        Compare eo = new Compare();
        int k = eo.compare(n,m);
    }
}
