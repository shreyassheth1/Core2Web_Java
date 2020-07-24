class ifDemo{
    public static void main(String[] args) {
        int x = 10;
        int y= 11;

        if(++x<=++y){
            System.out.println("in if");
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
        else{
            System.out.println("in else");
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
        System.out.println("out of if statement");
    }
}
