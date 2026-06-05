public class ValidPalindrome {

    public static boolean isValidPalindrome(String s){

        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right =  str.length() -1 ;


        while (left < right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }


        
        return true;
    }


    
    public static void main(String[] args) {

        String s = "abaa";
        System.out.println(isValidPalindrome(s));
    }   
}
