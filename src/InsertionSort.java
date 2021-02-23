public class Insertion {

    static void sort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int key = arr[i];
            int j = i - 1;

//            sorting elements by their indices
            while (j > -0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {34, 56, 77, 6, -8, -90, 0};
        Insertion.sort(arr);
        for (int element : arr) {
            System.out.println("element = " + element);
        }
    }
}