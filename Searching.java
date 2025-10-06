public class Searching {

    /** 
     * Linear search: returns index of target in arr, or –1 if not found 
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Binary search (iterative). Assumes arr is sorted. 
     * Returns index of target or –1 if not found.
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 15, 20};
        int target1 = 10;
        int target2 = 5;

        // Linear search
        int idx1 = linearSearch(arr, target1);
        System.out.println("linearSearch: target " + target1 + " → index " + idx1);

        int idx2 = linearSearch(arr, target2);
        System.out.println("linearSearch: target " + target2 + " → index " + idx2);

        // Binary search (requires sorted array)
        int idx3 = binarySearch(arr, target1);
        System.out.println("binarySearch: target " + target1 + " → index " + idx3);

        int idx4 = binarySearch(arr, target2);
        System.out.println("binarySearch: target " + target2 + " → index " + idx4);
    }
}
