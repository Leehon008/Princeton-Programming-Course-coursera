public class MergeSort {
    static int merged(int arr[], int l, int m, int r) {
        int s1 = m - l + 1;
        int s2 = r - m;

        int lArr[] = new int[s1];
        int rArr[] = new int[s2];

        for (int i = 0; i < s1; i++)
            lArr[i] = arr[l + i];
        for (int j = 0; j < s2; j++) {
            rArr[j] = arr[m + l + j];
        }
        int i = 0, j = 0;

        int k = l;

        while (i < s1 && j < s2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                k++;
            } else {
                arr[k] = rArr[j];
                k++;
            }
        }
        while (j < s1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < s2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int low, int high) {
        if (low = high) {
            int m = (low + high) / 2;

            sort(arr, low, m);
            sort(arr, m + 1, high);

            merged(arr, low, m, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 10, -3, 12};
        MergeSort.sort(arr, 0, arr.length + 1);

        for (int ele : arr) {
            System.out.println("ele = " + ele);
        }
    }
}