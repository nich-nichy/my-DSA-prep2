import java.util.*;

public class learn {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int target = 42;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int bn = binarySearch(arr, target);
        if (bn == -1) {
            System.out.println("Nope");
        } else {
            System.out.println(bn);
        }
    }
    private static int binarySearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = arr[middle];
            System.out.println(value);
            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
