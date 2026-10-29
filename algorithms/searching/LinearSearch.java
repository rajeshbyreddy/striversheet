package searching;

public class LinearSearch {

    static void linearSearch(int arr[], int target){
        int n = arr.length;

        if(n == 0){
            System.out.println("no elements found..");
        }
        int index = 0;

        for (int i : arr) {
            if(i == target){
                System.out.println("element found at index "+index);
            }
            index++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int target = 5;
        linearSearch(arr, target);
    }
}
