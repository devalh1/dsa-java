class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        s = s.toLowerCase();
        int right = s.length()-1;

        while(left<right){
            if(Character.isLetterOrDigit(s.charAt(left))==false){
                left++;
            }
            else if(Character.isLetterOrDigit(s.charAt(right))==false){
                right--;
            }
            // else if(Character.isLetterOrDigit(s.charAt(left))==false && Character.isLetterOrDigit(s.charAt(right))==false){
            //     left++;
            //     right--;
            //}
            else{
                if(s.charAt(left)==s.charAt(right)){
                    left++;
                    right--;
                }
                else 
                return false;
            }
        }
        return true;
    }
}