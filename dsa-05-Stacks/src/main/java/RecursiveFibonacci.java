public class RecursiveFibonacci {
    public static void main(String[] args) {

        //Recursion concept can be used in finding Factorial Number and Finding Fibonachi Number

        System.out.println(fib(2));
        System.out.println(fib(5));

        System.out.println(calculateFactorial(4));
    }
    public static int fib(int n){
        if (n==0) return 0;// termination
        if (n==1) return 1;// termination
        return fib(n-1)+fib(n-2);
    }

    public static int calculateFactorial (int n){
        // Base case: when n is 0 or 1, return 1
        if (n==0|| n==1 ){
            return 1;
        }else {
        // Recursive case: multiply n with the factorial of (n-1)
            return n* calculateFactorial(n-1);
        }
    }
}
