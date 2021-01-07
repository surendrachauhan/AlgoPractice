public class FindRotationCount {
    public static int findRotationCount(int [] arr, int n){
        int low=0; int high=arr.length-1;

        while(low<=high){
            if(arr[low] <= arr[high]) return low;
            int mid=(low+high)/2;
            int next=(mid+1)%n;
            int previous=(mid+n-1)%n;
            if(arr[mid]<=arr[next] && arr[mid] <= arr[previous]) return mid;
            else if(arr[mid] <= arr[high]) high=mid-1;
            else if(arr[mid] >= arr[low]) low=mid+1;
        }
        return -1;
    }

    public static void main(String [] args){
        int [] arr= {15,22,23,28,31,38,5,6,8,10,12,13,14,15};
        //int arr [] ={1,2,3,4,5,6,7,8,9};
        int count = findRotationCount(arr,14);
        System.out.println("The array is rotation times ::: "+count);
    }
}
