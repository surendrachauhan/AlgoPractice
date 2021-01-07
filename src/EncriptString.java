public class EncriptString {
   static void replaceEvenOddString(String args){
        char [] val = args.toCharArray();

        char evenOps = '@'; char oddPos='!';

        int repeat, ascii;

        for(int i=0; i<val.length;i++){

            ascii=val[i];
            repeat=ascii >= 97 ? ascii - 96 : ascii - 67;

            for(int j=0; j<repeat;j++) {
                //if
                if (i % 2 == 0) {
                    System.out.println("Odd position:::"+oddPos);
                } else {
                    System.out.println("Even position:::"+evenOps);
                }
            }
        }




}

    public static void main(String[] args)
    {
        char input[] = { 'A', 'b', 'C', 'd' };

        // Encrypt the String
        replaceEvenOddString("AbCd");
    }

}
