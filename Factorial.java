public class Factorial {

    public int factorial (int n, String type){


        int result = 0;

        if (type == "recursive"){
            result = factorial_recursive(n);
        }
        else if (type == "iterative"){
            result = factorial_iterative(n);
        }

        return result;
    }

    //iterative factorial
    public int factorial_iterative(int n){

        int total = 1;

        for (int x = 1; x <= n; x++){
            total = total * x;
        }

        return total;

    }

    //recursive factorial
    public int factorial_recursive(int n){

        if (n <=1){
            return 1;
        }

        return n * factorial_recursive(n-1);

    }



}
