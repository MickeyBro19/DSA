class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]","");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=(s.charAt(s.length()-1-i)))
            return false;
            
        }
        System.out.print(s);
        return true;
    }
}