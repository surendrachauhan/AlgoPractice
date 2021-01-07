public class BigONotation {
    private int [] thrArray;
    private int arraySize;
    private int itemInArray=0;
    static long startTime;
    static long endTime;

    //O(1)
    public void addItemInArray(int newItem){
        thrArray[itemInArray++]=newItem;
    }

    public BigONotation(int size){
        arraySize = size;
        thrArray=new int[size];

    }

    //O(n)

    public  void linearSearchForValue(int value){
        boolean valueInArray=false;
        String indexWithValue="";
         startTime = System.nanoTime();
        //startTime=System.currentTimeMillis();
        for(int i =0; i>arraySize;i++){
            if(thrArray[i]==value){
                valueInArray=true;
                indexWithValue += i + " ";
            }
        }
        System.out.println("Value Found :::"+valueInArray);
         endTime = System.nanoTime();
        //endTime = System.currentTimeMillis();
        System.out.println(" Time taken to find :::"+value+" is::: "+(endTime-startTime));
    }

    //O(n2)
    public void bubbleSort(){
        startTime = System.currentTimeMillis();
        for(int i =arraySize-1; i > 1 ; i--){
            for(int j=0; j<i; j++){
                if(thrArray[j]> thrArray[j+1]){
                   swapValue(j,j+1);
                }
            }
        }

        endTime = System.currentTimeMillis();

        System.out.println(" Total time taken is::: "+(endTime-startTime));

    }

    //O(log N) - Binary search faster but need the sorted element
    public void binarySearch(int value){
        startTime = System.currentTimeMillis();

        int lowIndex =0;
        int highIndex = arraySize-1;

        int timesThrough=0;

        while (lowIndex<=highIndex){
            int middleIndex = (lowIndex+highIndex)/2;

            if(thrArray[middleIndex]<value){
                lowIndex=middleIndex+1;
            }

            else if(thrArray[middleIndex]>value){
                highIndex=middleIndex-1;
            }

            else {
                System.out.println("Found Index :::"+middleIndex+" and value ::"+value);
                lowIndex=highIndex+1;
            }
            timesThrough++;
        }

        endTime = System.currentTimeMillis();
        System.out.println(" Total time taken is::: "+(endTime-startTime));
        System.out.println("Times through ::"+timesThrough);
    }

    public void swapValue(int i, int j){
        int temp =thrArray[i];
        thrArray[i]=thrArray[j];
        thrArray[j]=temp;
    }

    public void generateRandomArray(){
        for(int i =0;i<arraySize; i++){
           thrArray[i]=(int)(Math.random()*100)+10;
        }
        itemInArray = arraySize-1;
    }

    //o(n log n)
    public void quickSort(int left, int right){
        if(right-left <=0){
            return;
        }

        else
        {
            int pivot = thrArray[right];
            int pivotLocation = partitionArray(left,right,pivot);
            quickSort(left,pivotLocation-1);
            quickSort(pivotLocation+1,right);
        }
    }

    public int partitionArray(int left, int right, int pivot){
        int leftPointer = left-1;
        int rightPointer = right;

        while (true){
            while (thrArray[++leftPointer] < pivot);
            while (rightPointer> 0 && thrArray[--rightPointer] > pivot);
            if(leftPointer>=rightPointer){
                break;
            }
            else {
                swapValue(leftPointer,rightPointer);
            }
        }
        swapValue(leftPointer,right);
        return leftPointer;
    }

    public static void  main(String [] args){
        BigONotation bObj = new BigONotation(1000);
        bObj.generateRandomArray();

        BigONotation bObj2 = new BigONotation(20000);
        bObj2.generateRandomArray();

//        bObj.linearSearchForValue(30);
//        bObj2.linearSearchForValue(20);

//        bObj.bubbleSort();
//        bObj2.bubbleSort();
//
//        bObj.binarySearch(200);
//        bObj2.binarySearch(30);
        startTime = System.currentTimeMillis();
        bObj2.quickSort(0,bObj2.itemInArray);
        endTime = System.currentTimeMillis();
        System.out.println(" Total time taken is::: "+(endTime-startTime));

    }
}
