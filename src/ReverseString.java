import java.util.Arrays;

/**
 * Created by surviz on 2020/02/24.
 */
public class ReverseString {
    public static void main(String [] args){
        char [] str = "problem".toCharArray();
        System.out.println(" String::::"+Arrays.toString(str));
        reverseString(str);
    }

    public static void reverseString(char [] str){
        int left=0; int right=str.length-1;
        while(left<right){
            char tmp = str[left];
            str[left++]=str[right];
            str[right--]=tmp;
            System.out.println("left ++ ::::" + left +" str[left] "+str[left]);
            System.out.println("right -- ::::" + right +" str[right] "+str[right]);
            System.out.println("tmp -- ::::" +tmp);

        }
        System.out.println("reverse String::::" + Arrays.toString(str));
    }
}
