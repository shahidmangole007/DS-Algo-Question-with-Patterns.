public class RemoveDuplicatesfromSorted {
    
    public static int removeDuplicates(int[] nums) {

        int left = 0;
        int right = 0;

        while (right < nums.length) {

            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }

            right++;
        }

        return left + 1;
    }


    public static void main(String[] args) {
        int arr [] = { 10 , 20 , 30 , 30 , 40 , 40 , 50};

        System.out.println("Unique Elements count :"  + removeDuplicates(arr));

    }
}
