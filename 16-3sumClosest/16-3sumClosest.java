// Last updated: 8/2/2026, 11:53:16 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length-1;
        int res=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for (int i=0;i<n-1;i++){
            int j=i+1;
            int k=n;
            while(j<k){
                int total = nums[i]+nums[j]+nums[k];
                if(Math.abs(total-target)<Math.abs(res-target)) res=total;
                if(total>target) k--;
                else if(total<target) j++;
                else return total;
            }
        }
        return res;
    }
}