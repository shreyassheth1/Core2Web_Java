class EvenOdd{
    int evenOdd(int n){
        if(n%2==0){
            System.out.println(n+" is even");
            return 0;
        }
        System.out.println(n+" is odd");
        return 1;
    }
    public static void main(String[] args) {
        int n =10;
        EvenOdd eo = new EvenOdd();
        int k = eo.evenOdd(n);
    }
}
