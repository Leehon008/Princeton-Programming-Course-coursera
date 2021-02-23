public class QuickSort {

    static int partition(int arr[], int low, int high) {
        // pivot as last index
        int pivot = arr[high];

        //index of smaller element
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            //if current elem is smaller than or equal
            //swap arr[i] and arr[j]
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // now swap arr[i+1] and pivot or arr[high]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void sort(int arr[], int low, int high) {
        if (low < high) {
            int pa = partition(arr, low, high);
            sort(arr, low, pa - 1);
            sort(arr, pa + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {34, 2, 44, 55, 4, 9};
        QuickSort.sort(arr, 0, arr.length + 1);

        for (int ele : arr) {
            System.out.println("ele = " + ele);
        }
    }
}