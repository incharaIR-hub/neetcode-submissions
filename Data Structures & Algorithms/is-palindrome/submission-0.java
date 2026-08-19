class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        
        StringBuilder ns = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                ns.append(Character.toLowerCase(c));
            }
        }
        int r = ns.length()-1;
        while(l < r){
            char lc = ns.charAt(l);
            char rc = ns.charAt(r);
            if(lc != rc) return false;
            l++;
            r--;
        }
        return true;
    }
}