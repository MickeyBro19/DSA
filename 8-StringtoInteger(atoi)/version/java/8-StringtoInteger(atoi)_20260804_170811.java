// Last updated: 8/4/2026, 5:08:11 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        // String s=Integer.toString(x);
4        // int i=0;
5        // while(i<s.length()){
6        //     if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
7        //     i++;
8        // }
9        // return true;
10
11        if(x<0) return false;
12        int rev=0;
13        int num=x;
14        while(x!=0){
15            int curr=x%10;
16            rev=rev*10+curr;
17            x=x/10;
18        }
19        if(rev==num) return true;
20        return false;
21    }
22}