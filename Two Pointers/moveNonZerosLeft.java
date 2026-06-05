import java.util.Arrays;

public class moveNonZerosLeft {

    public static int[] moveNonZerosLeft(int[]arr){

        int left = 0;
        int right = 0;

        while (right < arr.length) {
            if(arr[right] != 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                
                left++;
            }
            right++;
        }


        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        //Output: [1,3,12,0,0]
        System.out.println(Arrays.toString(moveNonZerosLeft(arr)));
    }
}
