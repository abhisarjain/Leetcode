class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String s1 = s+s;
        String s2 = s1.substring(1, s1.length() - 1);
        if(s2.indexOf(s)==-1) return false;
        return true;
    }
}