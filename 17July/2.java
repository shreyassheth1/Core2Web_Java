class RelationalDemo{
    public static void main(String[] args) {
        int num1 =1;
        int num2 = 2;
        boolean ans;
        ans = (num1 != num2) && (num1<num2);
        System.out.println(ans);
        ans = (num1 >num2) || (num2 > num1)
        System.out.println(ans);
        ans = (++num1< num2++)&&(num1++<++num2);
        System.out.println("ans ="+ans+"\nnum1 = "+num1+"\nnum2 ="+num2);
    }
}
