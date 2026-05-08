public class HappyNumber{



    public static boolean isHappy(int n){

        int fast  = n;
        int slow = n;

        while (fast != 1) {

            slow = next(slow);
            fast = next(fast);
            fast = next(fast);

            if(slow == fast && fast != 1){
                return  false;
            }
        }

        return true;
    }


    public static int  next(int n){
        int sum = 0;
        
        while (n > 0) {
            int digit  = n % 10;
            n = n/10;
            sum  += digit * digit;
        }
        return sum;
    }



    public static void main(String[] args) {
        int num = 19; //2
        System.out.println(isHappy(num));
    }
}