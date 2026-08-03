// Last updated: 8/3/2026, 10:59:39 PM
1class Solution {
2    public int reverse(int x) {
3        long reverse=0;
4        while(x!=0){
5            int curr=x%10;
6            reverse=reverse*10+curr;
7            x=x/10;
8        }
9         // Check for 32-bit signed integer overflow
10        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
11            return 0;
12        }
13        
14        return (int) reverse;
15    }
16}