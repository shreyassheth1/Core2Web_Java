class Angle{
    int angle(int n){
        if(n<90){
            System.out.println(n+" is acute");
            return 0;
        }
        else if(n==0){
          System.out.println(n+" is right angle");
          return -1;
        }

        System.out.println(n+" is obtuse");
        return 1;

    }
    public static void main(String[] args) {
        int n =10;
        Angle eo = new Angle();
        int k = eo.evenOdd(n);
    }
}
