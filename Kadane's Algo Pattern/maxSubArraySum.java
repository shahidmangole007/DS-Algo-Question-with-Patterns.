public class maxSubArraySum {

    public static int findMaxSubArraySum(int arr[]){

        int bestEnding = arr[0];
        int ans = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            
            int c1  = bestEnding + arr[i];
            int c2 = arr[i];

            bestEnding = Math.max(c1, c2);
            ans = Math.max(ans, bestEnding);
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4 };
        System.out.println(findMaxSubArraySum(nums));
        // Output:  6 
    }
}