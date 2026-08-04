// Last updated: 8/4/2026, 4:53:52 PM
1class Solution {
2    public int myAtoi(String s) {
3        s=s.trim();
4        int i=0;
5        int sign=1;
6        long result=0;
7        if(s.length()==0) return 0;
8        if(s.charAt(0)=='-') {
9            sign=-1;
10            i++;
11        }else if(s.charAt(0)=='+' ){
12            sign=1;
13            i++;
14        }
15        while(i<s.length()){
16            char ch=s.charAt(i);
17            if(ch<'0' || ch>'9') break;
18            result=result*10 + (ch-'0');
19            if(sign*result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
20            if(sign*result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
21            i++;
22        }
23        return (int) (sign*result);
24    }
25}