package sorting;

public class Selection {

    static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        selectionSort(arr);
    }
}
