public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7};

        int sum = calculateSum(arr);
        double average = calculateAverage(sum, arr.length);
        int max = findMaximum(arr);

        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
        System.out.println("The maximum element in the array is: " + max);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double calculateAverage(int sum, int length) {
        return (double) sum / length;
    }

    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}