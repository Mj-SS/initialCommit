package pl.sda.szymon;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
   /* public static int factorial(int a){
        int fact = 1;
        fact *=a;
        return fact;
    }*/
   private static int factorial(int a){
       if (a == 1){
           return 1;
       }
       return a*factorial(a - 1);
   }
}
