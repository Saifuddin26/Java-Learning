import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};  // ✅ Correctly declare the array before usage

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Print in reverse order (without modifying array)
        System.out.print("Printed in Reverse Order: ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        // Reverse the array in place
        reverse(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            

    }
}
}
