class Solution {
    public boolean isPalindrome(String s) {
        char c[]=s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]","").toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]!=c[c.length-i-1])
            return false;
            
        }
        System.out.print(s);
        return true;
    }
}