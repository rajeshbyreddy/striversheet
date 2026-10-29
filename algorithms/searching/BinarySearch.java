package searching;
// Operating with a time complexity of \(O(\log n)\), it is significantly faster than a linear search (O(n)) for large datasets. 
public class BinarySearch {

    static void binarySearch(int arr[], int target){
        int left = 0;
        int right = arr.length -1;

        while (left <= right) {
            int mid = (left+right)/2;

            if(arr[mid] == target){
                System.out.println("element found ");
                return ;
            }else if(arr[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        System.out.println("no elements found");
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int target = 5;
        binarySearch(arr, target);
    }
}
