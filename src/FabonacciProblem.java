/**
 * Created by surviz on 2019/11/04.
 */
public class FabonacciProblem {

    public static int fabonacci(int n){
        int[] fib = new int[2];
        fib[0]=0;
        fib[1]=1;

        for(int i=2; i<=n ; ++i){
            fib[i%2] = fib[0]+fib[1];

        }
        System.out.println("Hi...."+fib[n%2]);
        return fib[n%2];
    }

    public static void main(String [] argd){
        int a = 5;
        FabonacciProblem.fabonacci(a);
    }
}
