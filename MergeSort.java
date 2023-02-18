public class MergeSort {

    public static void mergeSort(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid); // sort left part
        mergeSort(arr, mid + 1, end); // sort right part
        merge(arr, start, mid, end); // merge and sort right and left
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // if elements remains in left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // if elements remains in right

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = start; k < temp.length; k++, i++) {

            arr[i] = temp[k];

        }

    }

    public static void main(String args[]) {

        int arr[] = { 60, 70, 52, 20, -9 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        int start = 0;
        int end = arr.length - 1;

        mergeSort(arr, start, end);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

}
