/**
 * Created by surviz on 2020/02/24.
 */
public class FindBigNumber
{
    public static void main(String [] args){

        int a [] = {1,4,6,12, 8,3,9,10};
        int max = a[0];
        for(int i=0 ; i < a.length; i++)
        {
            if(max < a[i]){
                max= a[i];
            }

        }

        System.out.print("Maximum number is "+max);
    }

}
