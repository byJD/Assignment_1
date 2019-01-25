public class Practice1Test {

    protected String [] types;


    /*
     * Constructor for the class.
     */
    public Practice1Test () {
        types = new String [] {"recursive", "iterative"};
    }


    /*
     * This function tests three sample values of the factorial function.
     */
    public boolean testFactorial() {
        Factorial factorial = new Factorial();
        int[][] expectedValues = {{1, 1}, {4, 24}, {10, 3628800}};

        for (String type : types) {
            for (int i = 0; i < expectedValues.length; i++) {
                if (factorial.factorial(expectedValues[i][0], type) != expectedValues[i][1]) {
                    return false;
                }
            }
        }
        return true;
    }


    /*
     * This function tests three sample values of the Fibonacci function.
     */
    public boolean testFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int[][] expectedValues = {{1, 1}, {4, 3}, {10, 55}};

        for (String type : types) {
            for (int i = 0; i < expectedValues.length; i++) {
                if (fibonacci.fibonacci(expectedValues[i][0], type) != expectedValues[i][1]) {
                    return false;
                }
            }
        }
        return true;
    }


    /*
     * This function tests the general correctness of the functions we care about.
     */
    public void testCorrectness() {
        int grade = 0;
        System.out.println("Testing correctness.");
        try {
            if (testFactorial()) {
                System.out.println("[+50%] Correct implementation of factorial class.");
                grade += 50;
            }
            else {
                throw new Exception("Failed!");
            }
        }
        catch (Exception e) {
            System.out.println("[    ] Incorrect implementation of factorial class.");
        }
        try {
            if (testFibonacci()) {
                System.out.println("[+50%] Correct implementation of fibonacci class.");
                grade += 50;
            }
            else {
                throw new Exception("Failed!");
            }
        }
        catch (Exception e) {
            System.out.println("[    ] Incorrect implementation of fibonacci class.");
        }

        System.out.println("Grade for this assignment: " + grade + "%");
    }


    /*
     * This is a stub for testing the timing.
     * - Use it to compare recursion vs. iteration.
     * - Wall clock speed is sufficient for now.
     */
    public void testPerformance() {
        System.out.println("Advanced: implement the speed test.");
    }


    /*
     * Main...
     */
    public static void main(String[] args) {
        Practice1Test test = new Practice1Test();
        test.testCorrectness();
    }

}
