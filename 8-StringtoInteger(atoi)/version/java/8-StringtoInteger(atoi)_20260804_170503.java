// Last updated: 8/4/2026, 5:05:03 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        String s=Integer.toString(x);
4        int i=0;
5        while(i<s.length()){
6            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
7            i++;
8        }
9        return true;
10    }
11}