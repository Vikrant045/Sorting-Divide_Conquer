public class SearchInRotatedAndSorted {

    public static int search(int arr[], int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // line 1
        if (arr[start] <= arr[mid]) {

            // case a " search in left"
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, start, mid - 1, target);
            }
            // case b " search in right"
            else {
                return search(arr, mid + 1, end, target);
            }
        }

        // line 2
        else {

            // case c right
            if (arr[mid] <= target && target <= arr[end]) {
                return search(arr, mid + 1, end, target);
            }
            // case d left
            else {
                return search(arr, start, mid - 1, target);

            }

        }

    }

    public static void main(String args[]) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int start = 0;
        int target = 0;
        int end = arr.length - 1;
        System.out.println(search(arr, start, end, target));
    }

}
