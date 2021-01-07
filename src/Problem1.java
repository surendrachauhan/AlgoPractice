/**
 * Created by surviz on 2019/11/04.
 */
public class Problem1 {

    public int Solution(int [] A){
        int min=Integer.MAX_VALUE;
        System.out.println("Minimum Value :"+min);

        int leftSum=0;
        int rightSum=0;

        for (int a:A)  rightSum += a;

        System.out.println("RIGHT SUM :"+rightSum);

        for (int i=0; i<A.length-1; i++){
            leftSum += A[i];
            rightSum -= A[i];

            System.out.println("leftSum : "+leftSum+ "...rightSum : " + rightSum);

            int sub= Math.abs(leftSum-rightSum);

            System.out.println("sub : "+sub+ " ...min : " + min);

            if (sub<min){
                min=sub;
            }

            System.out.println("Changed sub : "+sub+ " ...min : " + min);

        }
        return min;
    }

public static void main(String args[]){

    int a [] = {2,4,1,5, 7,8,3,4};
    Problem1 p = new Problem1();
    p.Solution(a);

}

}
