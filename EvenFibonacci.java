
public class EvenFibonacci {

    static int sum = 0, fibonacciSequence = 0;

    public static void fibonacci (int i, int j) {

        fibonacciSequence = j;
        if (fibonacciSequence <= 4000000) { 
            if (j % 2 == 0) {
                sum += j;
            }
            fibonacci(j, i + j);
        } else {
            System.out.println(sum);
        }
    }

    
    public static void main(String[] args) {
	fibonacci(1,2);

    }
    
}
