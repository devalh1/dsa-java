class Solution {
    public int findNumbers(int[] nums) {
        int evenCount=0;
        int temp;
        for(int i = 0;i<nums.length;i++){
            int digitCount = 0;
            temp = nums[i];
            do{
                temp=temp/10;
                digitCount++;
            }while(temp!=0);
            if(digitCount%2==0)
                evenCount++;
        }
        return evenCount;
    }
}    