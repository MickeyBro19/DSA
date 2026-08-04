// Last updated: 8/4/2026, 5:23:14 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int n=height.length-1;
4        int i=0;
5        int maxArea=0;
6        while (i<n){
7            int currArea=Math.min(height[i],height[n])*(n-i);
8            maxArea=Math.max(maxArea,currArea);
9            if(height[i]>height[n]) n--;
10            else i++;
11        }
12        return maxArea;
13    }
14}