// Last updated: 8/4/2026, 5:10:06 PM
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
12        long rev=0;
13        int num=x;
14        while(x!=0){
15            
16            rev=rev*10+x%10;
17            x=x/10;
18        }
19        if(rev==num) return true;
20        return false;
21    }
22}