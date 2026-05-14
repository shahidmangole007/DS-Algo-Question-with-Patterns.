import java.util.Arrays;

public class MoveZeros {

    public static int[] segregate0and1(int[] arr) {

        int left = 0;
        int right = 0;

        while (right < arr.length) {
            if(arr[right] == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left ++;
            }

            right++;
        }

        return arr;

    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(segregate0and1(arr)));
        // Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
        
    }
}
