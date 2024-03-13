import java.util.Arrays;

public class Prog1{
    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        int sum = findSumOf2ndAnd3rdLargest(values);
        System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
    }

    public static int findSumOf2ndAnd3rdLargest(int[] arr) {
        if (arr.length < 2) {
            
            return 0;
        }

        Arrays.sort(arr);

        int secondLargest = arr[arr.length - 2];
        int thirdLargest = arr[arr.length - 3];

        return secondLargest + thirdLargest;
    }
}