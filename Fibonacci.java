public class Fibonacci {

    public int fibonacci (int n, String type){

        int result = 0;

        if (type == "recursive"){
            result = fibonacci_recursive(n);
        }
        else if (type == "iterative"){
            result = fibonacci_iterative(n);
        }

        return result;
    }

    //iterative fibonacci
    public int fibonacci_iterative(int n){

        if (n <= 1){
            return n;
        }

        int total = 0;
        int current= 1;
        int prev = 0;

        for (int x = 1; x < n; x++){

            total = current + prev;
            prev = current;
            current = total;

        }


        return total;
    }

    //recursive fibonacci
    public int fibonacci_recursive(int n){

        if (n <= 1){
            return n;
        }
        return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);

    }


}


//output = 1 if n == 0 or n == 1
//output = fib(n-1) + fib(n-2)
//0 1 1 2 3 5 8 13 21
