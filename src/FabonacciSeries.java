public class FabonacciSeries {
    public static void main(String [] args){
        int sum, t1=0, t2=1, n=100;

        while (t1 <= n){
            System.out.print(t1+" + ");

            //System.out.print(t2+" + ");
            sum=t1+t2;
            t1=t2;
            t2=sum;

        }
    }

}
