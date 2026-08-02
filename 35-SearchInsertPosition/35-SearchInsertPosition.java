// Last updated: 8/2/2026, 11:53:20 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        //Binary Search
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(end+start)/2;   // can use [start+(end-start)/2] to prevent integer overflow bugs
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return start;
    }
}