import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by surviz on 2020/02/26.
 */
public class FindDuplicateHash {

    public ArrayList containDuplicate(int [] arr){
        Set<Integer> set = new HashSet<>();
        ArrayList al=new ArrayList();
        for (int i =0 ; i < arr.length; i++){
            if(!set.add(arr[i])){
                  al.add(arr[i]);
             }
        }
        return al;
    }

    public static void main(String [] args){
        int [] ar = {2, 4, 5, 3, 5, 2, 6, 3, 4,11,12};
        FindDuplicateHash a = new FindDuplicateHash();
        ArrayList retArray = a.containDuplicate(ar);

        System.out.println("Contain Duplicate :::: " + retArray);
    }
}
