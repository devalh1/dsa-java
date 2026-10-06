class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length-1, k = nums.length-1;
        int result [] = new int[nums.length];    
        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[k] = nums[left]*nums[left];
                left++;
            }
            else{
                result[k]=nums[right]*nums[right];
                right--;
            }
            k = k - 1; 
        }
        return result
        ;
    }
}