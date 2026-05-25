import java.util.Arrays;

public class mergeSortedArrays {

    public static int[] mergeArray(int[] arr1 , int[] arr2 , int m  , int n){

        int i = n-1;
        int k = m-1;
        int j = (m-n) - 1;

        while (i >= 0  && j >= 0) {
            if(arr2[i] > arr1[j]){
                arr1[k] = arr2[i];
                i--;
            }else{
                arr1[k] = arr1[j];
                j--;
            }
            k--;
        }

        while (i >= 0) {
            arr1[k--] = arr2[i--];
        }

        return arr1;
    }



    public static void main(String[] args) {
        int[] arr1  = {1,3,5,0,0,0};
        int[] arr2 = {2,4,6};
        System.out.println(Arrays.toString(mergeArray(arr1, arr2 , 6 , 3)));
    }
}
