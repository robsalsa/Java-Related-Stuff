package CTI_Stuff;
import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4, 6, 5, 8, 7};

        // Sorting array by parity
        sortArrayByParity(array);

        // Displaying the sorted array
        System.out.println(Arrays.toString(array));
    }

    public static void sortArrayByParity(int[] arr) {
        int n = arr.length;
        int[] sortedArray = new int[n];

        // Traverse the array and copy even numbers to the beginning
        int evenIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sortedArray[evenIndex++] = arr[i];
            }
        }

        // Traverse the array again and copy odd numbers to the end
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sortedArray[evenIndex++] = arr[i];
            }
        }

        // Copy the sorted array back to the original array
        System.arraycopy(sortedArray, 0, arr, 0, n);
    }
}
