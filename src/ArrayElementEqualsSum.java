/**
 * Created by surviz on 2020/02/17.
 */
public class ArrayElementEqualsSum {



    public static void main(String [] args){
       int [] arr = {3,4,5,2,1,4,6,3,3,6};
       printResults(arr, 6);

    }

    public static void printResults(int [] arr , int val){

        for(int i=0; i < arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                int f_val = arr[i];
                int s_val = arr[j];

                if(f_val+s_val == val){
                    System.out.println("{"+f_val+" "+s_val+"} = "+val);
                }
            }
        }

    }

}
