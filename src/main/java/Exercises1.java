public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        if(n==0){
            return 1;
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
         long fib=1;
        long a , b;
        a = b = 1;
        for (int i=1 ;i<=n-2;i++){
            fib =a + b;
            a=b;
            b=fib;
        }
        return fib;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        char[][] mosallas = new char[rows][];
        for (int i = 0; i < rows; i++){
            mosallas[i] = new char[i+1];
            for (int j = 0; j <= i; j++){
                mosallas[i][j] = '*';
            }
        }
        return mosallas;
    }


    public static void main(String[] args) {
        // test your code here!
    }

}