import java.util.Arrays;

class TwoSum {

    public static int[] twoSum(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {-1 , -1};
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 7, 8, 9 };
        int target = 15;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}