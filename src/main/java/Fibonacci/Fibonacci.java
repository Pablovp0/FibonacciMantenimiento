package Fibonacci;

public class Fibonacci {

    public static int compute(int n){
        if(n<0){
            throw new RuntimeException("N no puede ser negativo");
        }else {
            if (n <= 1) {
                return n;
            } else {
                int i = compute(n - 1) + compute(n - 2);
                return i;
            }
        }
    }



    public static void main (String args[])
    {

        int n = 9;
        System.out.println(compute(n));
    }
}
