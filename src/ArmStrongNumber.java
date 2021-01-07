public class ArmStrongNumber {
    public static void main(String [] args){
        int number=371;
        int originalNumber ;
        int remainder;
        int result=0;
        originalNumber=number;

        while (originalNumber != 0){
            remainder=originalNumber%10;
            result += Math.pow(remainder,3);
            originalNumber = originalNumber/10;
            System.out.println("Number::"+number+" result::"+result+" remainder::"+remainder+" original Number::"+originalNumber);
        }
        if (result==number){
            System.out.println("Number is Armstrong..");
        }
        else {
            System.out.println("Number is not Armstrong..");
        }
    }
}
