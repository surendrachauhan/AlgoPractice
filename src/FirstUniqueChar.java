import java.util.HashMap;

/**
 * Created by surviz on 2020/02/27.
 */
public class FirstUniqueChar {
    public int firtUniqueChar(String s){
        HashMap<Character,Integer> uniqueStr = new HashMap<Character,Integer>();

        int strLength = s.length();

        for(int i =0 ; i < strLength ; i++){
            char a = s.charAt(i);
            uniqueStr.put(a, uniqueStr.getOrDefault(a,0)+1);

        }

        for(char key : uniqueStr.keySet()){
            System.out.print(" key ::: "+key);
        }

        for(int val : uniqueStr.values()){
            System.out.print(" val ::: "+val);
        }

        for(int j=0 ; j<strLength ; j++){
            if(uniqueStr.get(s.charAt(j)) == 1){
                return 1;
            }
        }
       return -1;
    }

    public static void main(String [] args){

        FirstUniqueChar fObj = new FirstUniqueChar();
        int resVal = fObj.firtUniqueChar("helo");
        System.out.println(" resVal ::: "+resVal);

    }
}
