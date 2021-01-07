public class SortArray
{
    public static int [] sortingArray(int[] array){
      for(int i=1; i<array.length;i++){
            for(int j=i;j>0;j--){
              //  System.out.println("Value of i::"+i+" and j ::"+j);
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
      return array;
    }

    public static void main(String [] args){
        SortArray sObj = new SortArray() ;
        int [] array = {30 ,10,80,53,90,20};
        int [] res = sortingArray(array);
        for(int x=0;x<res.length;x++){
            System.out.println(" sorted array :::"+res[x]);
        }
    }



}
