public class maxSubarrayProduct {
    
    public static int findMaxSubArrayProduct(int arr[]){

        int minProd = arr[0];
        int maxProd = arr[0];
        int res = arr[0];

        for(int i = 1 ; i < arr.length ; i++){

            int v1  = arr[i] * maxProd;
            int v2  = arr[i] * minProd;
            int v3 = arr[i];

            maxProd = Math.max(v1, Math.max(v2, v3));
            minProd = Math.min(v1, Math.min(v2, v3));

            res = Math.max(res, Math.max(maxProd, minProd));
        }



        return res;
    }

    public static void main(String[] args) {
        int arr[] = {-4 , 3 , -2};
        int maxProduct = findMaxSubArrayProduct(arr);
        System.out.println(maxProduct);
    }
}
