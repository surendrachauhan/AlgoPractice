import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BinarySearch {
    public static void main(String [] args){
        int [] arr = {23, 3,45, 54, 3, 2, 1, 6, 89,3};
        int val= 3;
        HashMap resVal = binarySearch(arr,val);
        resVal.forEach((key,value) -> System.out.println(key + " = " + value));


    }

    public static HashMap binarySearch(int [] arr, int val){

        int low=0;
        int high=arr.length-1;
          HashMap arrRes = new HashMap( );
        int middle;
        int count=0;
        for(int i=0; i<high; i++){
            middle = (low+high)/2;

             if(arr[middle]>val){
                high=middle-1;
            }
            else if(arr[middle] <val){
                low=middle+1;
            }
            else if(arr[middle]==val){
                 System.out.println("Value found :::: "+arr[middle]);
                 arrRes.put(i,val);
                 high=middle-1;
                 low=middle+1;
                 count++;
            }
         System.out.println("Count :::"+count);
        }
        return arrRes;
    }
}
