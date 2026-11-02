class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int beginning = 0; 
        int ending = nums.size()-1;
        int count = 0;
        while(beginning < ending){
            int sum = nums.get(beginning) + nums.get(ending);
            if(sum<target){
                count = count +(ending -beginning);
                beginning+=1;
            }
            else
                ending-=1;
        }
        return count;
    }
}