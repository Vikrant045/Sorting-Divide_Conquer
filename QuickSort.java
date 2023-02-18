public class QuickSort {

    public static void QuickSort(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }
        int pivotIndex = partition(arr, start, end);

        QuickSort(arr, start, pivotIndex - 1); // left
        QuickSort(arr, pivotIndex + 1, end); // reight

    }

    public static int partition(int arr[], int start, int end) {

        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j <= end; j++) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String args[]) {

        int arr[] = { 45, 2, 65, 20, 66, 02 };
        for (int j = 0; j < arr.length; j++) {

            System.out.print(" " + arr[j]);
        }
        System.out.println();

        int start = 0;
        int end = arr.length - 1;
        QuickSort(arr, start, end);
        for (int j = 0; j < arr.length; j++) {

            System.out.print(" " + arr[j]);
        }

    }

}
