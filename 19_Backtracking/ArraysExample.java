public class ArraysExample {

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void arrayBacktrack(int[] arr, int index, int value) {
        if (index == arr.length) {
            printArray(arr);
            return;
        }

        arr[index] = value;
        arrayBacktrack(arr, index + 1, value + 1);
        arr[index] = arr[index] - 2;

    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arrayBacktrack(arr, 0, 1);
        printArray(arr);
    }
}