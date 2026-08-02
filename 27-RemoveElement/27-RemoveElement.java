// Last updated: 8/2/2026, 11:53:22 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}