import java.util.ArrayList;

/**
 * Created by surviz on 2020/02/17.
 */
public class FindDupes {
    public static void main(String [] args){
        int [] numbers = {1, 2, 3, 4, 5, 6, 3, 4, 2, 5,99,99};
        ArrayList duplicates  = new ArrayList();

        for (int x=0; x<numbers.length; x++){
            for (int y=x+1; y<numbers.length; y++){
               // System.out.println("numbers[x] :: "+numbers[x]+ " and numbers[y]:::"+numbers[y]);
                if(numbers[x]==numbers[y]){
                    System.out.println("Number are equal :: " + numbers[x] + " and " + numbers[y]);
                    duplicates.add(numbers[y]);
                }
            }

        }

        System.out.println(" Array is duplidates :::"+duplicates);


    }




}
