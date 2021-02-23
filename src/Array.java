public class Selection {

    static void sort(int[] arr) {
        int len = arr.length;

        //find the min element index
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            //swap the elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, -7 - 0 - 3};

        Selection.sort(arr);
        for (int element : arr) {
            System.out.println("elements are : " + element + "");
        }
    }
}